package com.denisov.leetCode.challenge;

import java.util.Arrays;
import java.util.List;

public class FizzBizz {
    public List<String> fizzBuzz(int n) {
        String[] array = new String[n];

        for(int i = 1; i <= n; i++) {
            if(i % 15 == 0)
                array[i - 1] = "FizzBuzz";
            else if(i % 5 == 0)
                array[i - 1] = "Buzz";
            else if(i % 3 == 0)
                array[i - 1] = "Fizz";
            else
                array[i - 1] = String.valueOf(i);
        }

        return Arrays.asList(array);
    }
}
