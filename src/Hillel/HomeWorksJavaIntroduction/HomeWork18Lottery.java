package Hillel.HomeWorksJavaIntroduction;
/**
 * ДЗ 18. Лотерея
 * <p>
 * Сделать два массива из 7-ми чисел, заполненных случайными цифрами (от 0 до 9).
 * Первый массив - это числа загаданные компанией(рэндом), которая организовывает лотерею.
 * Второй массив - это числа которые угадал игрок (вводим из консоли).
 * После того как оба массива заполнены цифрами, нужно отсортировать их по возрастанию любым способом.
 * В отсортированных массивах найти количество совпадений, т.е. чисел в двух массивах с одинаковым индексом; Например:
 * first[3] должен быть равен second[3], как показано ниже.
 * Пример вывода в консоль (совпали 1й, 4й и 6й элементы):
 * [0, 1, 4, 5, 5, 8, 9]
 * [1, 1, 2, 3, 5, 6, 9]
 * Количество совпадений: 3
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HomeWork18Lottery {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Игра Лотерея! Домашнее задание 18 Сложная версия с уникальными числами");

        //почти по условиям задачи
        int min = 0;
        int max = 20;
        int sizeOfArrays = 7;
        int concurrency = 0; //переменная для подсчета совпадений

        //создаём массивы на основе параметров задачи
        int[] lotteryNumbers = new int[sizeOfArrays];
        int[] userNumbers = new int[sizeOfArrays];

        //заполняем случайными УНИКАЛЬНЫМИ неповторяющимися числами
        fillArraysRandomNumbersWithoutDuplicates(lotteryNumbers, max, min);

        //вводим с консоли числа в массив с контролем без повторов
        System.out.println("Угадай и введи 7 раз число от 1 до 20: ");
        fillArraysFromConsoleWithoutDuplicates(userNumbers);

        //сортируем массивы
        Arrays.sort(lotteryNumbers);
        Arrays.sort(userNumbers);

        //Выводим массивы
        System.out.println("Лотерейная последовательность: " + Arrays.toString(lotteryNumbers));
        System.out.println("Числа введенные пользователем: " + Arrays.toString(userNumbers));
        System.out.print("Вы угадали числа: ");

        //Находим совпадения и выводим в консоль
        for (int i = 0; i < lotteryNumbers.length; i++) {
            int index = search(lotteryNumbers, userNumbers[i]); //Находим совпадения в массиве лотереи
            if (index != -1) {
                System.out.print(lotteryNumbers[index] + ", ");//выводим в строку числа из лотереи
                concurrency++;//подсчитываем количество совпадений
            }
        }
        System.out.println(" в лотерейном билете");
        System.out.println("Количество угаданных чисел: " + concurrency);


    }

    //ввод чисел с проверкой от 0 до 20 не больше не меньше и без повторов ранее введенных
    private static void fillArraysFromConsoleWithoutDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int d1 = getNumber();
            int searchNumber = search(array, d1);
            while (d1 <0 || d1 >= 21 || searchNumber>-1) {
                System.out.println("УПС! Подходят числа только от 1 до 20 и БЕЗ повторов, попробуйте еще раз");
                d1 = getNumber();
                searchNumber = search(array, d1);
            }
            array[i] = d1;
        }
    }

    //заполнение массивов УНИКАЛЬНЫМИ случайными числами
    private static void fillArraysRandomNumbersWithoutDuplicates(int[] array, int max, int min) {
        int randomNumber = randomGenerator(max, min);
        array[0] = randomNumber;
        for (int i = 0; i < array.length; i++) {
            randomNumber = randomGenerator(max, min);
            int searchNumber = search(array, randomNumber);
            while (searchNumber > -1) {
                randomNumber = randomGenerator(max, min);
                searchNumber = search(array, randomNumber);
            }
            array[i] = randomNumber;
        }
    }

    private static int randomGenerator(int max, int min) { //random generator method
        double random = Math.random();

        int r2 = (int) ((random * (max - min)) + min);
        return r2;
    }

    private static int search(int[] numbers, int search) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                return i;
            }
        }
        return -1;
    }

    private static Integer getNumber() {
        try {
            //System.out.println("input only number: ");
            String str = READER.readLine();
            return Integer.parseInt(str);
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
            return getNumber();
        }
    }


}
