package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int upper) {
        return max(left, max(right, upper));
    }

    public static int max(int left, int right, int upper, int lower) {
        return max(lower, max(right, max(left, upper)));
    }
}