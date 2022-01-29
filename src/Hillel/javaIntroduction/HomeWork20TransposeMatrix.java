package Hillel.javaIntroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Транспонировать матрицу MxN.
 *
 * Задавать размер матрицы необходимо из консоли.
 *
 * Значения также получить из консоли
 */

public class HomeWork20TransposeMatrix {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("ДЗ:20 Транспонирование матрицы");
        System.out.println("Введите количество строк");
        int columns = getNumber();
        System.out.println("Введите количество столбцов");
        int strings = getNumber();

        //главная матрица
        int[][] matrix = new int[columns][strings];
        //перевернутая матрица
        int[][] transposedMatrix = new int[strings][columns];

        //заполняем матрицу
        fillMatrix(matrix);

        System.out.println("Матрица введенная вами: ");

        //выводим матрицу в консоль
        printingMatrix(matrix);
        //переворачиваем матрицу
        transposingMatrix(matrix, transposedMatrix);
        System.out.println("Транспонированная матрица");
        //выводим матрицу транспонированную
        printingMatrix(transposedMatrix);
    }

    private static void fillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Введите число для ячейки матрицы с индексами: " + "( " + i + ":" + j + " )");
                matrix[i][j] = getNumber();
            }
        }
    }

    private static void transposingMatrix(int[][] matrix, int[][] transposedMatrix) {
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                transposedMatrix[i][j] = matrix[j][i];

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
