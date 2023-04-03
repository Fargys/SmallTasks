package com.denisov.study;

public class Recursion {

    // вычисление факториала
    public int factorial(int value) {
        if (value < 1)
            return 1;

        return factorial(value - 1) * value;
    }

    // все натуральные числа до аргумента
    public String getEachValueTo(int value) {
        if (value < 2)
            return Integer.toString(value);

        return getEachValueTo(value - 1) + value;
    }

    // все натуральные числа между аргументами
    public String getEachValueBetween(int from, int to) {
        if (from == to)
            return Integer.toString(to);

        return getEachValueBetween(from, to - 1) + to;
    }

    // проверка аргумента на степень двойки
    public boolean isPowerOfTwo(int value) {
        if (value == 1)
            return true;
        if (value % 2 != 0)
            return false;

        return isPowerOfTwo(value / 2);
    }

    // подсчёт составных чисел аргумента
    public int countSumOfDigit(int value) {
        if (value < 10)
            return value;

        return countSumOfDigit(value / 10) + (value % 10);
    }

    // реверс аргумента с добавлением пробелов
    public String revertWithEscapes(int value) {
        if (value < 10)
            return Integer.toString(value);

        return (value % 10) + " " + revertWithEscapes(value / 10);
    }

    // печать аргумента с добавлением пробелов
    public String printWithEscapes(int value) {
        if (value < 10)
            return Integer.toString(value);

        return printWithEscapes(value / 10) + " " + (value % 10);
    }

    // поиск всех натуральных множителей числа
    public String getAllMultipliers(int value, int multiplier) {
        if (value % multiplier != 0)
            getAllMultipliers(value, ++multiplier);

        if (value < multiplier * 2)
            return Integer.toString(value);

        return multiplier + " " + getAllMultipliers(value / multiplier, multiplier);
    }

    // проверка на палиндром
    public boolean isPalindrome(String value) {
        if (value.charAt(0) != value.charAt(value.length() - 1))
            return false;
        if (value.length() <= 2)
            return true;

        return isPalindrome(value.substring(1, value.length() - 1));
    }
}
