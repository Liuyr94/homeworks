package com.bessonov.homeworks.homework3.gb;

import java.util.Scanner;

public class NumberGuesser {
    public static void main(String[] args) {
        gamePlay();
    }

    private static int generateNumber() {
        return (int) (Math.random() * 10);
    }

    private static int getAttemptCount() {
        return 3;
    }

    private static void gamePlay() {
        System.out.println("Компьютер загадал случайное число в диапазоне от 0 до 9.");
        System.out.println("Попробуйте отгадать загаданное число компьютером");
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int number = generateNumber();
        int count = getAttemptCount();
        while (count > 0) {
            System.out.println("У вас на данный момент " + count + " попытки.");
            System.out.println("Введите число: ");
            result = scanner.nextInt();
            if (result == number) {
                System.out.println("Вы победили, ура");
                break;
            }
            count--;
            System.out.println("Неверно, следующая попытка");
        }
        System.out.println("Попробуйте ещё раз");
    }
}
