package com.bessonov.homeworks.homework2.gb;

import java.util.Arrays;

public class MainApplications {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        fillsDiagonals(arr);
    }

    public static void replaceNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void fillValuesArrays(int[] array) {
        for (int i = 0, val = 0; i < array.length; i++) {
            array[i] = val;
            val += 3;
        }

        System.out.println(Arrays.toString(array));
    }

    public static void increaseNumberTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void fillsDiagonals(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - i - 1] = 1;
        }
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    public static void searchMinMaxElement(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }

    public static boolean checkBalance(int[] array) {
        int sumLeft = 0;
        for (int i = 0; i < array.length; i++) {
            sumLeft += array[i];
            int sumRight = 0;
            for (int j = i + 1; j < array.length; j++) {
                sumRight += array[j];
            }
            if (sumLeft == sumRight) {
                System.out.println(i);
                System.out.println(sumLeft);
                System.out.println(sumRight);
                return true;
            }
        }
        return false;
    }

    public static int[] shiftingArray(int[] array, int number) {
        if (number == 0 || number % array.length == 0) {
            return array;
        }

        int tmp = 0;
        if (number > 0) {
            while (number > 0) {
                tmp = array[array.length - 1];
                for (int j = array.length - 2; j > -1; j--) {
                    array[j + 1] = array[j];
                }
                array[0] = tmp;
                number--;
            }
            return array;
        } else {
            while (0 > number) {
                tmp = array[0];
                for (int i = 0; i < array.length - 1; i++) {
                    array[i] = array[i + 1];
                }
                array[array.length - 1] = tmp;
                number++;
            }
            return array;
        }
    }
}
