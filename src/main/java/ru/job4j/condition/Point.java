package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = x2 - x1;
        double two = y2 - y1;
        double three = Math.sqrt(first);
        double four = Math.sqrt(two);
        double fife = three + four;
        double six = Math.pow(fife, 2);
        return six;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);

        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}