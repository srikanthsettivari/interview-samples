package com.practice;

public class SecondHighest {
    public static void main (String args[]) {
        int[] inta = {4,7,8,10,90, 989, 67};
        System.out.println(findSecondHighest(inta));
    }
    private static int findSecondHighest(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i : array) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest) {
                secondHighest = i;
            }

        }
        return secondHighest;
    }
}
