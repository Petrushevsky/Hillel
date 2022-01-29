package Hillel.HomeWorksJavaIntroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * ЗАДАНИЕ
 * В Японии числа 4 и 9 считаются несчастливыми. Вам нужно вывести только счастливые числа от 0 до 100.
 * Нужно исключить из вывода все числа, которые содержат 4 и 9.
 * (не должно быть цифр 4 и 9 не только в первом десятке, но и 14, 19, 24, 39, и т.д.)
 * 4.14.24.34.44
 * 9.19.29.39.49
 * <p>
 * /
 */

public class HomeWork12_LuckyNumbers2 {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException  {

        System.out.println("Введите первое неудачное число, от 0 до 9: ");
        Integer val1 = getNumber();
        System.out.println("Введите второе неудачное число, от 0 до 9: ");
        Integer val2 = getNumber();
        System.out.println("Введите число до которого вывести результат без неудачных чисел до 100:");
        Integer maxValue = getNumber();
        System.out.println("Результат задачи без неудачных чисел:");
        printLuckyNumbers(maxValue, val1, val2);//метод для вывода счастливых чисел без вводимых цифр

    }

    private static void printLuckyNumbers(int maxValue, int val1, int val2) {

        for (int i = 0; i <= maxValue; i++) {
            //упростил задачу значительно, до обеда лучше делать дз чем на ночь
            if (i == val1 || i == val2 || (i / 10 == val1) || (i / 10 == val2) || (i % 10 == val1) || (i % 10 == val2)) {
                continue;
            }
            //выводим все удачные
            System.out.println("Happy number: " + i);


        }
        System.out.println("Ну вот и всё, песня спета");
    }
//взял безвозмездно и нагло скопировал, не изучил еще досконально с урока сами исключения
    private static Integer getNumber() {
        try {
            //System.out.println("input number:");
            String str = READER.readLine();
            return Integer.parseInt(str);
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
            return getNumber();
        }
    }
}

