package com.denisov.study.mycollections;

import java.util.Objects;

public class MyHashMap<K, V> implements MyMap<K, V> {
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;
    public static final int MAXIMUM_CAPACITY = 1 << 30; // Integer.MAX_VALUE / 2 + 1
    private static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; //16

    private Node<K, V>[] table;

    private int size;
    private int threshold;
    private final float loadFactor;

    public MyHashMap(int initialCapacity, float loadFactor) {
        if (initialCapacity < 0)
            throw new IllegalArgumentException("Illegal initial capacity: " + initialCapacity);

        if (initialCapacity > MAXIMUM_CAPACITY)
            initialCapacity = MAXIMUM_CAPACITY;

        if (loadFactor <= 0 || Float.isNaN(loadFactor))
            throw new IllegalArgumentException("Illegal load factor: " + loadFactor);

        this.loadFactor = loadFactor;
        this.threshold = tableSizeFor(initialCapacity);
    }

    // if capacity is power of two, then return capacity
    // else return the next number of power of two after capacity
    private static int tableSizeFor(int capacity) {
        int n = -1 >>> Integer.numberOfLeadingZeros(capacity - 1);
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }


    @Override
    public V get(Object key) {
        Node<K, V> node = getNode(hash(key), key);
        return node == null ? null : node.value;
    }

    private Node<K, V> getNode(int hash, Object key) {
        Node<K, V>[] tab;
        int length;
        Node<K, V> first;
        Node<K, V> e;
        K k;

        if ((tab = this.table) != null && (length = tab.length) > 0
                && (first = tab[(length - 1) & hash]) != null) {
            if (first.hash == hash &&
                    ((k = first.key) == key || (key != null && key.equals(k))))
                return first;

            if ((e = first.next) != null) {
                do {
                    if (e.hash == hash &&
                            ((k = e.key) == key || (key != null && key.equals(k))))
                        return e;
                } while ((e = e.next) != null);
            }
        }

        return null;
    }

    @Override
    public V put(K key, V value) {
        int hash = hash(key);

        Node<K, V>[] tab;
        int length;
        Node<K, V> p;
        int index;

        if ((tab = this.table) == null || (length = tab.length) == 0)
            length = (tab = resize()).length;
        if ((p = tab[index = (length - 1) & hash]) == null)
            tab[index] = new Node<>(hash, key, value);
        else {
            Node<K, V> e;
            K k;
            if (p.hash == hash && ((k = p.key) == key || (key != null && key.equals(k))))
                e = p;
            else {
                if ((e = p.next) == null)
                    p.next = new Node<>(hash, key, value);
            }
            if (e != null) {
                return e.value;
            }

        }

        if (++size > threshold)
            resize();

        return null;
    }

    private Node<K, V>[] resize() {
        Node<K, V>[] oldTable = this.table;
        int oldCapacity = (oldTable == null) ? 0 : oldTable.length;
        int oldThreshold = threshold;
        int newCapacity;
        int newThreshold = 0;

        if (oldCapacity > 0) {
            if (oldCapacity >= MAXIMUM_CAPACITY) {
                threshold = Integer.MAX_VALUE;
                return oldTable;
            } else if ((newCapacity = oldCapacity << 1) < MAXIMUM_CAPACITY &&
                    oldCapacity >= DEFAULT_INITIAL_CAPACITY)
                newThreshold = oldThreshold << 1;
        } else if (oldThreshold > 0)
            newCapacity = oldThreshold;
        else {
            newCapacity = DEFAULT_INITIAL_CAPACITY;
            newThreshold = (int) (DEFAULT_LOAD_FACTOR * DEFAULT_INITIAL_CAPACITY);
        }

        if (newThreshold == 0) {
            float ft = (float) newCapacity * loadFactor;
            newThreshold = (newCapacity < MAXIMUM_CAPACITY && ft < (float) MAXIMUM_CAPACITY
                    ? (int) ft : Integer.MAX_VALUE);
        }

        threshold = newThreshold;
        @SuppressWarnings({"unchecked"})
        Node<K, V>[] newTable = (Node<K, V>[]) new Node[newCapacity];
        table = newTable;

        if (oldTable != null) {
            for (int j = 0; j < oldCapacity; ++j) {
                Node<K, V> e;
                if ((e = oldTable[j]) != null) {
                    oldTable[j] = null;
                    if (e.next == null)
                        newTable[e.hash & (newCapacity - 1)] = e;
                    else { // preserve order
                        Node<K, V> loHead = null, loTail = null;
                        Node<K, V> hiHead = null, hiTail = null;
                        Node<K, V> next;
                        do {
                            next = e.next;
                            if ((e.hash & oldCapacity) == 0) {
                                if (loTail == null)
                                    loHead = e;
                                else
                                    loTail.next = e;
                                loTail = e;
                            } else {
                                if (hiTail == null)
                                    hiHead = e;
                                else
                                    hiTail.next = e;
                                hiTail = e;
                            }
                        } while ((e = next) != null);
                        if (loTail != null) {
                            loTail.next = null;
                            newTable[j] = loHead;
                        }
                        if (hiTail != null) {
                            hiTail.next = null;
                            newTable[j + oldCapacity] = hiHead;
                        }
                    }
                }
            }
        }

        return newTable;
    }

    @Override
    public V remove(Object key) {
        Node<K, V> e = removeNode(hash(key), key);
        return e == null ? null : e.value;
    }

    private Node<K, V> removeNode(int hash, Object key) {
        Node<K, V>[] tab;
        Node<K, V> p;
        int length;
        int index;

        if ((tab = table) != null && (length = tab.length) > 0
                && (p = tab[index = (length - 1) & hash]) != null) {
            Node<K, V> node = null;
            Node<K, V> e;
            K k;

            if (p.hash == hash &&
                    ((k = p.key) == key || (key != null && key.equals(k))))
                node = p;
            else if ((e = p.next) != null) {
                do {
                    if (e.hash == hash &&
                            ((k = e.key) == key || (key != null && key.equals(k)))) {
                        node = e;
                        break;
                    }
                    p = e;
                } while ((e = e.next) != null);
            }

            if (node != null) {
                if (node == p)
                    tab[index] = node.next;
                else
                    p.next = node.next;

                --size;
                return node;
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    private static int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    private static class Node<K, V> implements MyEntry<K, V> {
        final int hash;
        final K key;
        V value;
        Node<K, V> next;

        Node(int hash, K key, V value) {
            this.hash = hash;
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V newValue) {
            V oldValue = value;
            value = newValue;
            return oldValue;
        }

        @Override
        public int hashcode() {
            return Objects.hashCode(key) ^ Objects.hashCode(value);
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this)
                return true;
            if (obj instanceof MyMap.MyEntry) {
                MyEntry<?, ?> e = (MyEntry<?, ?>) obj;
                return Objects.equals(key, e.getKey()) && Objects.equals(value, e.getValue());
            }
            return false;
        }
    }
}