package com.denisov.study.mycollections;

import java.util.Objects;

public class MyArrayList<E> implements MyCollection<E> {
    private static final int DEFAULT_CAPACITY = 10;

    transient Object[] elementData;
    private int size = 0;

    public MyArrayList() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public boolean add(E element) {
        if (size == elementData.length)
            resize(elementData.length * 2);

        elementData[size++] = element;
        return true;
    }

    @Override
    public boolean add(int index, E element) {
        if (size == elementData.length)
            resize(elementData.length * 2);

        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[size++] = element;
        return true;
    }

    @Override
    public E get(int index) {
        Objects.checkIndex(index, size);
        return elementData(index);
    }

    @Override
    public E set(int index, E element) {
        Objects.checkIndex(index, size);
        E oldValue = elementData(index);
        elementData[index] = element;
        return oldValue;
    }

    @Override
    public E remove(int index) {
        Objects.checkIndex(index, size);
        E oldValue = elementData(index);

        if ((size - 1) > index)
            System.arraycopy(elementData, index + 1, elementData, index, size - index);

        elementData[size--] = null;
        return oldValue;
    }

    @Override
    public int size() {
        return size;
    }

    @SuppressWarnings("unchecked")
    private E elementData(int index) {
        return (E) elementData[index];
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(elementData, 0, newArray, 0, size);
        elementData = newArray;
    }
}