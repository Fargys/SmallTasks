package com.denisov;

import com.denisov.util.pojo.Car;
import com.denisov.util.pojo.User;
import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApi {

    public int[] sortArray(int[] array) {
        return IntStream.of(array)
                .sorted()
                .toArray();
    }

    public int[] sortArrayReverse(int[] array) {
        return IntStream.of(array)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public String[] sortString(String[] array) {
        return Stream.of(array)
                .sorted()
                .toArray(String[]::new);
    }

    public String[] sortStringReverse(String[] array) {
        return Stream.of(array)
                .sorted(Collections.reverseOrder())
                .toArray(String[]::new);
    }

    public User[] sortUserArray(User[] array) {
        Comparator<User> comparator = (u1, u2) -> {
            if (u1.getAge() == u2.getAge()) {
                return u1.getName().compareTo(u2.getName());
            } else return u1.getAge() - u2.getAge();
        };

        return Stream.of(array)
                .sorted(comparator)
                .toArray(User[]::new);
    }

    public int[] filterOdds(int[] array) {
        return IntStream.of(array)
                .filter(a -> a % 2 == 0)
                .toArray();

    }

    public long countStrings(String[] array, int minLength) {
        return Stream.of(array)
                .filter(s -> s.length() >= minLength)
                .count();

    }

    public long countNoEmptyString(String[] array, String contains) {
        return Stream.of(array)
                .filter(StringUtils::isNotBlank)
                .filter(s -> s.contains(contains))
                .count();
    }

    public int[] multiplyNumbers(int[] array, int multiplier) {
        return IntStream.of(array)
                .map(i -> i * multiplier)
                .toArray();
    }

    public String[] capitalizeString(String[] array) {
        return Stream.of(array)
                .map(StringUtils::capitalize)
                .toArray(String[]::new);

    }

    public String[] mapObjectToString(Car[] array) {
        return Stream.of(array)
                .map(Car::getNumber)
                .toArray(String[]::new);
    }

    public String[] mapObjectToStringWithFilter(Car[] array, int since) {
        return Stream.of(array)
                .filter(car -> car.getYear() > since)
                .map(Car::getNumber)
                .filter(StringUtils::isNotBlank)
                .toArray(String[]::new);
    }

    public Set<String> mapListToSetAndUpper(String[] array) {
        return Stream.of(array)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());

    }

    public Queue<String> mapListToNotBlankQueue(String[] array) {
        return Stream.of(array)
                .filter(StringUtils::isNotBlank)
                .collect(Collectors.toCollection(LinkedList::new));
    }

    public Map<Integer, List<User>> groupByAges(User[] array) {
        return Stream.of(array)
                .collect(Collectors.groupingBy(User::getAge));
    }

    public Map<Integer, Long> groupByAgeAndCount(User[] array) {
        return Stream.of(array)
                .collect(Collectors.groupingBy(User::getAge, Collectors.counting()));
    }

    public Map<Integer, Integer> groupByAgeAndSum(User[] array) {
        return Stream.of(array)
                .collect(Collectors.groupingBy(User::getAge, Collectors.summingInt(User::getAge)));

    }

    public User[] flatUsers(User[] array) {
        return Stream.of(array)
                .filter(user -> user.getSubUsers() != null)
                .map(User::getSubUsers)
                .flatMap(Arrays::stream)
                .toArray(User[]::new);
    }

    public int[] flatArray(int[][] array) {
        return Stream.of(array)
                .flatMapToInt(Arrays::stream)
                .toArray();

    }

    public String findAny(String[] array, String contains) {
        return Stream.of(array)
                .filter(s -> s.contains(contains))
                .findAny()
                .orElse(null);
    }

    public int findFirst(int[] array, int min) {
        return IntStream.of(array)
                .filter(i -> i > min)
                .findAny()
                .orElse(0);
    }

    public boolean anyMatch(int[] array) {
        return IntStream.of(array)
                .anyMatch(i -> i % 2 != 0);
    }

    public boolean allMatch(int[] array) {
        return IntStream.of(array)
                .allMatch(i -> i % 2 == 0);
    }

    public boolean noneMatch(int[] array) {
        return IntStream.of(array)
                .noneMatch(i -> i % 2 != 0);
    }

    public int sumArrayItem(int[] array) {
        return IntStream.of(array)
                .reduce(Integer::sum)
                .orElse(0);
    }

    public int sumArrayItemAndValue(int[] array, int initValue) {
        return IntStream.of(array)
                .reduce(initValue, Integer::sum);
    }

    public int sumMultiplyEveryItem(int[] array, int multiplier) {
        return IntStream.of(array)
                .map(i -> i * multiplier)
                .reduce(Integer::sum)
                .orElse(0);
    }

    public int searchMinValue(int[] array) {
        return IntStream.of(array)
                .min()
                .orElse(0);
    }

    public String searchLongestString(String[] array) {
        return Stream.of(array)
                .reduce("", (str1, str2) -> str1.length() > str2.length() ? str1 : str2);
    }

    public int[] limit(int[] array, int limit) {
        return IntStream.of(array)
                .limit(limit)
                .toArray();
    }

    public int[] skip(int[] array, int skip) {
        return IntStream.of(array)
                .skip(skip)
                .toArray();
    }
}