package com.denisov.mycollections;

public class MyLinkedList<E> implements MyCollection<E> {
    int size;
    Node<E> first;
    Node<E> last;

    public MyLinkedList() {
    }

    @Override
    public boolean add(E item) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, item, null);
        last = newNode;

        if (l == null)
            first = newNode;
        else
            l.next = newNode;

        size++;
        return true;
    }

    @Override
    public boolean add(int index, E element) {
        if (index == size)
            add(element);
        else {
            final Node<E> currentNode = node(index);
            final Node<E> prev = currentNode.prev;
            final Node<E> newNode = new Node<>(prev, element, currentNode);
            currentNode.prev = newNode;

            if (prev == null)
                first = newNode;
            else
                prev.next = newNode;
            size++;
        }

        return true;
    }

    @Override
    public E get(int index) {
        return node(index).item;
    }

    @Override
    public E set(int index, E element) {
        Node<E> x = node(index);
        E oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    @Override
    public E remove(int index) {
        Node<E> node = node(index);

        final Node<E> prev = node.prev;
        final E element = node.item;
        final Node<E> next = node.next;

        if (prev == null)
            first = next;
        else {
            prev.next = next;
            node.prev = null;
        }

        if (next == null)
            last = prev;
        else {
            next.prev = prev;
            node.next = null;
        }

        node.item = null;
        size--;

        return element;
    }

    @Override
    public int size() {
        return size;
    }

    Node<E> node(int index) {
        Node<E> node;
        if (index < (size >> 1)) {
            node = first;
            for (int i = 0; i < index; i++)
                node = node.next;
        } else {
            node = last;
            for (int i = size - 1; i > index; i--)
                node = node.prev;
        }
        return node;
    }


    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}