package ru.job4j.math;

public class Examp {
    public static int mult(int num) {
        int sum = 0;
        for (int i = 0; num > 0; i = num % 10) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(mult(1234));
        System.out.println(mult(536));
            }
}
