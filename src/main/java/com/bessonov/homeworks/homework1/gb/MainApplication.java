package com.bessonov.homeworks.homework1.gb;

public class MainApplication {
    public static void main(String[] args) {
        byte b = 127;
        short s = 354;
        int i = 381238;
        long l = 4898485684L;
        float f = 1234.548F;
        double d = 89719165.123431423;
        char c = '2';
        String str = "Rodya";
        leapYear((short) 0);
    }

    public static float calFunc(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean checkRange(byte oneNumber, byte secondNumber) {
        return oneNumber + secondNumber >= 10 && oneNumber + secondNumber <= 20;
    }

    public static void checkPositiveNumber(int number) {
        if (number >= 0) {
            System.out.println("Число положительное: " + number);
            return;
        }
        System.out.println("Число отрицательное: " + number);
    }

    public static void printName(String name) {
        System.out.println("Привет, " + name);
    }

    public static void leapYear(short year) {
        if (year < 0) {
            System.out.println("Год считается от первого прихода, отрицательным быть не может");
            return;
        }
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Високосный");
            return;
        }
        System.out.println("Не високосный");
    }
}
