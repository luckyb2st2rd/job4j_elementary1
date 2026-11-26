package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 80;
    }

    public static float rubleToDollar(float value) {
        return value / 70;
    }

    public static void main(String[] args) {
        float input = 160;
        float expected = 2;
        float output = rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2. Test result : " + passed);

        input = 140;
        output = rubleToDollar(input);
        passed = expected == output;
        System.out.println("140 rubles are 2. Test result : " + passed);
    }
}
