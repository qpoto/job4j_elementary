package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float inEur = 140;
        float expectedEur = 2;
        float euro = Converter.rubleToEuro(inEur);
        boolean passedEur = expectedEur == euro;
        System.out.println("140 rubles are 2 euro. Test result : " + passedEur);

        float inDol = 120;
        float expectedDol = 2;
        float dollar = Converter.rubleToDollar(inDol);
        boolean passedDol = expectedDol == dollar;
        System.out.println("120 rubles are 2 dollar. Test result : " + passedDol);

    }
}