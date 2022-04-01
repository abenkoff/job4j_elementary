package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;

    }

    public static float euroToRuble(float value) {
        float rsl = value * 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float dollarToRuble(float value) {
        float rsl = value * 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are " + euro + " euro. Test result: " + passed);

        float ruble = Converter.euroToRuble(70);
        in = 70;
        expected = 4900;
        out = Converter.euroToRuble(in);
        passed = expected == out;
        System.out.println("70 euro are " + ruble + " ruble. Tet result: " + passed);
        float dollar = Converter.rubleToDollar(60);
        in = 60;
        expected = 1;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("60 rubles are " + dollar + " dollar. Test result: " + passed);
        ruble = Converter.dollarToRuble(60);
        in = 60;
        expected = 3500;
        out = Converter.dollarToRuble(in);
        passed = expected == out;
        System.out.println("34 dollar are " + ruble + " ruble. Test result: " + passed);
    }
}
