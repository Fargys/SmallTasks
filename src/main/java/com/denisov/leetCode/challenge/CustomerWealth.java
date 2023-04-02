package com.denisov.leetCode.challenge;

public class CustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int result = 0;

        for (int[] account : accounts) {
            int count = 0;

            for (int anAccount : account)
                count += anAccount;

            if (count > result) result = count;
        }

        return result;
    }
}
