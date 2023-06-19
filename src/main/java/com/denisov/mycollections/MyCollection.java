package com.denisov.mycollections;

public interface MyCollection<E> {
    boolean add(E item);

    boolean add(int index, E element);

    E get(int index);

    E set(int index, E element);

    E remove(int index);

    int size();
}