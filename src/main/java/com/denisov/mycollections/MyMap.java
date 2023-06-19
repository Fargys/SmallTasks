package com.denisov.mycollections;

public interface MyMap<K, V> {
    V get(Object key);

    V put(K key, V value);

    V remove(Object key);

    int size();

    interface MyEntry<K, V> {
        K getKey();

        V getValue();

        V setValue(V newValue);

        boolean equals(Object obj);

        int hashcode();
    }
}