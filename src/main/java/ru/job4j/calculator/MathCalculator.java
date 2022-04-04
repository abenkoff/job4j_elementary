package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiplay(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subAndDiv(double first, double second) {
        return sub(first, second)
                + div(first, second);
    }

    public static double allSumFunc(double first, double second) {
        return sum(first, second) + multiply(first, second) + sub(first, second) + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiplay(10, 20));
        System.out.println("Результат второй суммы равен: " + subAndDiv(30, 10));
        System.out.println("Общий результат суммы всех вычислений равен: " + allSumFunc(50, 20));
    }
}
