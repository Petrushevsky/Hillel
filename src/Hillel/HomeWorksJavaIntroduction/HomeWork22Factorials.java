package Hillel.HomeWorksJavaIntroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Вычислить факториал числа N с помощью рекурсивной функции
 */
public class HomeWork22Factorials {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("ДЗ:22 Факториал и рекурсия");
        System.out.println("Введите число n! для вычесления факториала от n от 0 до 20, во избежание переполнения типа LONG");
        int number = getNumber();

        //делаем проверку числа для факториала от 0 до бесконечности
        number = readFromConsoleCorrectNumbers(number);

        //вывод в консоль
        System.out.println("Факториал числа " + number + " равен: " + factorial(number) + " вариант с рекурсией");
        System.out.println("Факториал числа " + number + " равен: " + factorialV2(number) + " вариант с циклом");

    }

    private static int readFromConsoleCorrectNumbers(int n) {
        //проверяем на правила факториалов больше 1
        while (n < 0 || n > 20) {
            System.out.println("УПС! Подходят числа только от 0 до 20 включительно, попробуйте еще раз");
            n = getNumber();
        }
        if (n == 0) {
            n = 1; //так принято что факториал от 0 равен 1
        }
        return n;
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

    public static long factorial(long number) {
        if (number == 1) {
            return number;
        }
        return number * factorial(number - 1);
    }

    public static long factorialV2(int x) {
        long result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }
}
