package com.bessonov.homeworks.homework3.gb;

import java.util.Arrays;
import java.util.Scanner;

public class Gallows {
    public static void main(String[] args) {
        gamePlay();
    }

    private static String[] returnsArrayWithWords() {
        return new String[]{ "apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato" };
    }

    private static String makesUpAWord(String[] str) {
        return str[(int) (Math.random() * str.length)];
    }

    private static void gamePlay() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Компьютер загадал случайное слово из этого перечня");
        String hiddenWord = makesUpAWord(returnsArrayWithWords());
        System.out.println(Arrays.toString(returnsArrayWithWords()));
        StringBuilder hint = new StringBuilder("***************");
        while (true) {
            System.out.println("Введите пожалуйста ваш вариант ответа: ");
            String result = scanner.next();
            int wordLength = Math.min(hiddenWord.length(), result.length());
            if (hiddenWord.equals(result)) {
                System.out.println("Ура вы победили!!!");
                break;
            }
            for (int i = 0; i < wordLength; i++) {
                if (hiddenWord.charAt(i) == result.charAt(i)) {
                    hint.setCharAt(i, hiddenWord.charAt(i));
                }
            }
            System.out.println("Подсказка " + hint);
            System.out.println("Продолжайте!!!");
        }
    }
}
