package Hillel.javaIntroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Дан двумерный массив, содержащий отрицательные и положительные числа.
 * Выведете на экран номера тех ячеек массива, которые содержат отрицательные числа
 */

public class HomeWork21NegativeNumbers {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("ДЗ:21 Негативные числа");
        System.out.println("Введите количество строк");
        int strings = getNumber();
        System.out.println("Введите количество столбцов");
        int columns = getNumber();

        //главная матрица
        int[][] matrix = new int[columns][strings];

        //заполняем матрицу
        fillMatrix(matrix);

        //выводим матрицу в консоль
        System.out.println("Вы ввели 2х мерный массив: ");
        printingMatrix(matrix);

        System.out.println("Выводим результаты: ");
        printingNegativeNumbersIndexes(matrix);//выводим негативные числа, их индексы
    }

    private static void printingNegativeNumbersIndexes(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    System.out.println("Ячейка двумерного массива " + "[" + i + ":" + j + "]" + " содержит отрицательное число: " + matrix[i][j]);
                }

            }

        }
    }

    private static void fillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Введите число для ячейки матрицы с индексами: " + "( " + i + ":" + j + " )");
                matrix[i][j] = getNumber();
            }
        }
    }

    private static void printingMatrix(int[][] transposedMatrix) {
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                System.out.print(transposedMatrix[i][j] + ", ");
            }
            System.out.println();
        }
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
