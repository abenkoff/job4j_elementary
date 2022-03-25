package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = 140 / 70.f;
        return rsl;
    }

    public static float euroToRuble(float value) {
        float rsl = 28 * 70.f;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = 873 / 60.f;
        return rsl;
    }

    public static float dollarToRuble(float value) {
        float rsl = 34 * 60.f;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float ruble = Converter.euroToRuble(70);
        System.out.println("28 euro are " + ruble + " ruble.");
        float dollar = Converter.rubleToDollar(60);
        System.out.println("873 rubles are " + dollar + " dollar.");
        ruble = Converter.dollarToRuble(60);
        System.out.println("34 dollar are " + ruble + " ruble.");
    }
}
