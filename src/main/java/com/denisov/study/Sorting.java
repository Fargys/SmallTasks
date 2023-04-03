package com.denisov.study;

public class Sorting {

    // Сдвигает вправо самый большой элемент в массиве.
    public static void bubble(int[] array) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    swap(array, j - 1, j);
                    isSorted = false;
                }
            }
        }
    }

    // Сдвигает влево самый маленький элемент в массиве.
    public static void selection(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;

            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex])
                    minIndex = j;
            }

            swap(array, i, minIndex);
        }
    }

    // Делит массив на отсортированную левую и неотсортированную правую часть
    public static void insert(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 && (array[j - 1] > array[j]); j--) {
                swap(array, j - 1, j);
            }
        }
    }

    // Рекурсивно разбивает массив до одного элемента, потом соединяет массивы сравнивая элементы
    public static void merging(int[] array, int length) {
        if (length < 2) return;

        int mid = length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[length - mid];

        System.arraycopy(array, 0, leftArray, 0, mid);
        if (length - mid >= 0) System.arraycopy(array, mid, rightArray, 0, length - mid);

        merging(leftArray, mid);
        merging(rightArray, length - mid);

        merge(array, leftArray, rightArray, mid, length - mid);
    }

    private static void merge(int[] array, int[] leftArray, int[] rightArray, int left, int right) {
        int leftPointer = 0;
        int rightPointer = 0;
        int counter = 0;

        while (leftPointer < left && rightPointer < right) {
            if (leftArray[leftPointer] <= rightArray[rightPointer])
                array[counter++] = leftArray[leftPointer++];
            else
                array[counter++] = rightArray[rightPointer++];
        }

        while (leftPointer < left)
            array[counter++] = leftArray[leftPointer++];

        while (rightPointer < right)
            array[counter++] = rightArray[rightPointer++];
    }

    // Приводит массив к куче, перемещает максимальный элемент из корня в конец массива.
    // Таким образом делит массив на отсортированный хвост и неотсортированную кучу.
    public static void heaping(int[] array) {
        int length = array.length;

        for (int i = length / 2 - 1; i >= 0; i--)
            heapify(array, length, i);

        for (int i = length - 1; i >= 0; i--) {
            swap(array, 0, i);
            heapify(array, i, 0);
        }

    }

    private static void heapify(int[] array, int length, int i) {
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
        int largest = i;

        if (leftChild < length && array[largest] < array[leftChild])
            largest = leftChild;

        if (rightChild < length && array[largest] < array[rightChild])
            largest = rightChild;

        if (largest != i) {
            swap(array, largest, i);
            heapify(array, length, largest);
        }

    }

    // Выбирает случайный элемент и сортирует массив на большие и меньшие элементы в зависимости от выбранного.
    public static void quick(int[] array, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(array, begin, end);

            quick(array, begin, partitionIndex - 1);
            quick(array, partitionIndex + 1, end);
        }
    }

    private static int partition(int[] array, int begin, int end) {
        int pivot = array[end];
        int i = begin - 1;

        for (int j = begin; j < end; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, end);

        return i + 1;
    }


    // утилиты
    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
