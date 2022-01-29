package Hillel.HomeWorksJavaIntroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Пользователь задает последовательность целых чисел.
 * Сохраните ее в массив.
 * Узнать является ли последовательность строго возрастающей.
 * Строго возрастающая последовательность означает, что каждое следующее число больше предыдущего.
 */
public class HomeWork14RisingArrays {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Введите размер массива: ");
        Integer sizeOfArray = getNumber();
        int[] numbers = new int[sizeOfArray];//создаем массив размером введеным пользователем
        fillArray(numbers);//заполняем массив
        boolean isRising = checkRising(numbers);//проверяем последовательность
        printArray(numbers);//выводим массив в ОДНУ строку последовательностью
        resulting(isRising);//итоговый результат
    }

    private static void resulting(boolean isRising) {
        System.out.print(" ИТОГО: ");
        if (isRising) {
            System.out.println("Последовательность строго возрастающая!");
        } else {
            System.out.println("Последовательность не является возрастающей!");
        }
    }

    private static boolean checkRising(int[] numbers) {
        //перебираем с 0 индекса последовательность ,если строгая то задаем переменно Истину
        int d1 = numbers[0];
        boolean isRising = false;
        for (int i = 1; i < numbers.length; i++) {
            if (d1 >= numbers[i]) {
                isRising = false;
                continue;
            } else {
                isRising = true;
            }
            d1 = numbers[i];
        }
        return isRising;
    }

    private static void fillArray(int[] numbers) {
        //вводим согласно размеру массиву количество ячеек
        System.out.println("Введите "+numbers.length+" цифр:");
        for (int i = 0; i < numbers.length; i++) {
            Integer numberInput = getNumber();
            numbers[i] = numberInput;
        }
    }

    private static void printArray(int[] numbers) {
 //выводим в строку массив
        System.out.print("Массив вы ввели: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ",");
        }
        System.out.println(":)");
    }

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
