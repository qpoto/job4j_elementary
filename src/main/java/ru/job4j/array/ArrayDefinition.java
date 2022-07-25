package ru.job4j.array;

public class ArrayDefinition  {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] names = new String[4];
            names[0] = "Anastasiya";
            names[1] = "Stanislav";
            names[2] = "Anna";
            names[3] = "Olga";
            System.out.println(names[0]);
            System.out.println(names[1]);
            System.out.println(names[2]);
            System.out.println(names[3]);
        float[] prices = new float[40];
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива names равен: " + names.length);
        System.out.println("Размер массива prices равен: " + prices.length);

    }
}
