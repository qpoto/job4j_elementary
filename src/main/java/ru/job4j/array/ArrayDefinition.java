package ru.job4j.array;

public class ArrayDefinition  {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
            surnames[0] = "Anastasiya";
            surnames[1] = "Stanislav";
            surnames[2] = "Anna";
            surnames[3] = "Olga";
            System.out.println(surnames[0]);
            System.out.println(surnames[1]);
            System.out.println(surnames[2]);
            System.out.println(surnames[3]);
        float[] prices = new float[40];
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);

    }
}
