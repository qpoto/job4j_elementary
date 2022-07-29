package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        boolean result = true;
        for (int i = left.length - 1; i < right.length;) {
            return left[left.length - 1] == right[right.length - 1];
        }
        return result;
    }
}