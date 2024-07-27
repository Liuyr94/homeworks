package com.bessonov.homeworks.homework1.otus;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите один из методов:\n1 - greetings()\n2 - checkSign(int a, int b, int c)\n3 - " +
                "selectColor(int data)\n4" +
                " - compareNumbers(int a, int b)\n5 - addOrSubtractAndPrint(int value, int delta, boolean increment)");
        int userInput = scanner.nextInt();
        if (userInput == 1) {
            greetings();
        } else if (userInput == 2) {
            System.out.println("Введите три целочисленных параметра:");
            checkSign(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        } else if (userInput == 3) {
            System.out.println("Введите целочисленный параметр от 0 до ...: ");
            selectColor(scanner.nextInt());
        } else if (userInput == 4) {
            System.out.println("Введите два целочисленных параметра: ");
            compareNumbers(scanner.nextInt(), scanner.nextInt());
        } else if (userInput == 5) {
            System.out.println("Введите два целочисленных параметра и один boolean: ");
            addOrSubtractAndPrint(scanner.nextInt(), scanner.nextInt(), scanner.nextBoolean());
        }
    }

    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    public static void checkSign(int a, int b, int c) {
        if (a + b + c >= 0) {
            System.out.println("Сумма положительная");
            return;
        }
        System.out.println("Сумма отрицательная");
    }

    public static void selectColor(int data) {
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data < 21) {
            System.out.println("Желтый");
        } else if (data > 20) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
            return;
        }
        System.out.println("a < b");
    }

    public static void addOrSubtractAndPrint(int value, int delta, boolean increment) {
        if (increment) {
            System.out.println(value + delta);
            return;
        }
        System.out.println(value - delta);
    }
}
