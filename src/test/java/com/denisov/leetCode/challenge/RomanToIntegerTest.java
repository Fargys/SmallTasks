package com.denisov.leetCode.challenge;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class RomanToIntegerTest {

    private final RomanToInteger romanToInt = new RomanToInteger();

    @Test
    public void toTen() {
        int result = romanToInt.romanToInt("I");
        Assertions.assertEquals(1, result);

        result = romanToInt.romanToInt("II");
        Assertions.assertEquals(2, result);

        result = romanToInt.romanToInt("III");
        Assertions.assertEquals(3, result);

        result = romanToInt.romanToInt("IV");
        Assertions.assertEquals(4, result);

        result = romanToInt.romanToInt("V");
        Assertions.assertEquals(5, result);

        result = romanToInt.romanToInt("VI");
        Assertions.assertEquals(6, result);

        result = romanToInt.romanToInt("VII");
        Assertions.assertEquals(7, result);

        result = romanToInt.romanToInt("VIII");
        Assertions.assertEquals(8, result);

        result = romanToInt.romanToInt("IX");
        Assertions.assertEquals(9, result);

        result = romanToInt.romanToInt("X");
        Assertions.assertEquals(10, result);
    }

    @Test
    public void toHundred() {
        int result = romanToInt.romanToInt("XIV");
        Assertions.assertEquals(14, result);

        result = romanToInt.romanToInt("XIX");
        Assertions.assertEquals(19, result);

        result = romanToInt.romanToInt("XL");
        Assertions.assertEquals(40, result);

        result = romanToInt.romanToInt("XLIV");
        Assertions.assertEquals(44, result);

        result = romanToInt.romanToInt("XLIX");
        Assertions.assertEquals(49, result);

        result = romanToInt.romanToInt("L");
        Assertions.assertEquals(50, result);

        result = romanToInt.romanToInt("XC");
        Assertions.assertEquals(90, result);

        result = romanToInt.romanToInt("XCIV");
        Assertions.assertEquals(94, result);

        result = romanToInt.romanToInt("XCIX");
        Assertions.assertEquals(99, result);

        result = romanToInt.romanToInt("C");
        Assertions.assertEquals(100, result);
    }

    @Test
    public void toThousand() {
        int result = romanToInt.romanToInt("CD");
        Assertions.assertEquals(400, result);

        result = romanToInt.romanToInt("CDXLIV");
        Assertions.assertEquals(444, result);

        result = romanToInt.romanToInt("D");
        Assertions.assertEquals(500, result);

        result = romanToInt.romanToInt("CM");
        Assertions.assertEquals(900, result);

        result = romanToInt.romanToInt("CMXCIX");
        Assertions.assertEquals(999, result);

        result = romanToInt.romanToInt("M");
        Assertions.assertEquals(1000, result);
    }

    @Test
    public void leetCode() {
        int result = romanToInt.romanToInt("III");
        Assertions.assertEquals(3, result);

        result = romanToInt.romanToInt("LVIII");
        Assertions.assertEquals(58, result);

        result = romanToInt.romanToInt("MCMXCIV");
        Assertions.assertEquals(1994, result);
    }
}
