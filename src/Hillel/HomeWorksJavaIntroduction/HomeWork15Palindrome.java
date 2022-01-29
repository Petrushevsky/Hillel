package Hillel.HomeWorksJavaIntroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Locale;

/**
 * Пример строки палиндром - А роза упала на лапу азора
 * Читается слева направо так же как и справа налево
 * Написать функцию, которая будет определять является ли строка палиндромом
 */

public class HomeWork15Palindrome {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static boolean isPalind(char[] word) {
        int i = 0;//начало массива строк
        int j = word.length - 1; //конец масиива -1
        while (i < j) {
            if (word[i] != word[j]) {
                return false;
            }
            i++;//идем от начала
            j--;//идем от конца массива
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        String sequence = READER.readLine();//считываем слово палиндром
        sequence = sequence.toLowerCase(Locale.ROOT);//выравниваем регистр

        char[] charsSequence = sequence.toCharArray();
        System.out.println("Разбил строку на массив символов: " + Arrays.toString(charsSequence));
        if (isPalind(charsSequence)) {
            System.out.print(sequence + " - это слово является палиндромом");
        } else {
            System.out.print(sequence + " - это слово Не является палиндромом");
        }

    }
}
