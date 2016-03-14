package com.lucky.lotto.numbergen.util;

import java.util.Arrays;
import java.util.Random;

public class AlgorithmManager {
    private static int[] genNums = new int[6];

    public int[] getGenNums() {
        return genNums;
    }

    public static int[] makeSixNumbers() {
        final int min = 1;
        final int max = 45;
        Random ran = new Random();
        int count = 0;

        while(count < 6) {
            int num = ran.nextInt((max - min) + 1) + min;
            if(isIncludeGeneratedNumber(num)) continue;

            genNums[count] = num;
            count++;
        }

        Arrays.sort(genNums);
        return genNums;
    }

    private static boolean isIncludeGeneratedNumber(int num) {
        boolean isInclude = false;

        for(int arrayNum : genNums) {
            isInclude = arrayNum == num;
            if(isInclude) break;
        }

        return isInclude;
    }
}
