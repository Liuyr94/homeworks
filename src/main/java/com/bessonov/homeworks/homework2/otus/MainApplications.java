package com.bessonov.homeworks.homework2.otus;

import java.util.Arrays;

public class MainApplications {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(reverseArray(array)));
    }

    public static void printingString(String str, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(str);
        }
    }

    public static void sumsElementArrayGreaterFive(int[] array) {
        int sums = 0;
        for (int j : array) {
            if (j > 5) {
                sums += j;
            }
        }
        System.out.println(sums);
    }

    public static void fillsArrayWithSpecifiedNumber(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = number;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void incrementsEachElementArrayNumber(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += number;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void printsConsoleWhichHalvesArrayLarger(int[] array) {
        int firstHalf = 0;
        int secondHalf = 0;
        for (int i = 0; i < array.length / 2; i++) {
            firstHalf += array[i];
            secondHalf += array[array.length - 1 - i];
        }
        if (firstHalf > secondHalf) {
            System.out.println("Сумма первой половины больше: " + firstHalf);
        } else if (secondHalf > firstHalf) {
            System.out.println("Сумма второй половины больше: " + secondHalf);
        } else {
            System.out.println("Сумма обоих половин равна");
        }
    }

    public static int[] returnsArrayEqualSumIncoming(int[]... arr) {
        int lengthLargestArray = 0;
        for (int[] ints : arr) {
            if (ints.length > lengthLargestArray) {
                lengthLargestArray = ints.length;
            }
        }
        int[] resultArray = new int[lengthLargestArray];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                resultArray[i] = arr[i][j];
            }
        }

        return resultArray;
    }

    public static void checkBalance(int[] array) {
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < array.length; i++) {
            sumLeft += array[i];
            for (int j = i + 1; j < array.length; j++) {
                sumRight += array[j];
            }
            if (sumLeft == sumRight) {
                System.out.println("В данном массиве есть точка баланса она находиться в " + array[i]);
                break;
            }
        }
        System.out.println("В данном массиве нету точки баланса");
    }

    public static void checkArrayOrder(int[] array, int number) {
        if (number == 1) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    System.out.println("Элементы в массиве не идут по возрастанию");
                    break;
                }
            }
        } else {
            for (int i = array.length - 1; i > 1; i--) {
                if (array[i] < array[i - 1]) {
                    System.out.println("Элементы в массиве не идут по убыванию");
                }
            }
        }
    }

    public static int[] reverseArray(int[] array) {
        int tmp = 0;
        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = tmp;
        }
        return array;
    }
}
