package Hillel.javaIntroduction.HomeWork30Converter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyConsoleUtils {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
   public static final String LINE = "========================================================";
    public static void main(String[] args) throws IOException {

    }
    //
    public static int getMenuItem() {
        System.out.println(LINE);
        System.out.println("Выберите вариант конвертаци и введите в консоль!");
        System.out.println("1. - перевести в Кельвины");
        System.out.println("2. - перевести в Фаренгейты");
        System.out.println(LINE);
        int menuItem = getNumber();
        while (menuItem <= 0 || menuItem >= 3) {
            System.out.println("Введите или 1 или 2");
            menuItem = getNumber();
        }
        return menuItem;
    }
    /*private static void fillArraysFromConsoleWithoutDuplicates(double[] array) {
        for (int i = 0; i < array.length; i++) {
            double d1 = getNumber();
            double searchNumber = search(array, d1);
            while (d1 <0 || d1 >= 21 || searchNumber>-1) {
                System.out.println("УПС! Подходят числа только от 1 до 20 и БЕЗ повторов, попробуйте еще раз");
                d1 = getNumber();
                searchNumber = search(array, d1);
            }
            array[i] = d1;
        }
    }*/
    //дз прошлые
    private static int search(int[] numbers, int search) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                return i;
            }
        }
        return -1;
    }
    //дз прошлые
    public static int randomGenerator(int max, int min) { //random generator method
        double random = Math.random();
        int r2 = (int) ((random * (max - min)) + min);
        return r2;
    }
    public static void printLine(){
        System.out.println(MyConsoleUtils.LINE);
    }
    //метод с прошлых дз
    public static int getNumber() {
        try {
            //System.out.println("input only number: ");
            String str = READER.readLine();
            return Integer.parseInt(str);
        } catch (Exception exception) {
            System.out.println("Error: only numbers" + exception.getMessage());
            return getNumber();
        }
    }
}
