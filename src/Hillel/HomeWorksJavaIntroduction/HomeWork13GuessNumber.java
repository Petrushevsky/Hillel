package Hillel.HomeWorksJavaIntroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Отгадать целое число, которое "загадал" компьютер в диапазоне от 0 до 10.
 * Пользователь отгадывает число, ПОКА не отгадает.
 * Число загаданное компьютером должно генерироваться рендомно (перед тем как пользователь начнет угадывать).
 */
public class HomeWork13GuessNumber {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        //считываем переменные для диапазона случайных чисел
        System.out.println("Сыграем в игру Угадай число!");
        System.out.println("Введите дипазон чисел для игры, например от 0 до 10, но можно и больше!!!");
        System.out.println("Введите первое число диапазона: ");
        Integer min = getNumber();
        System.out.println("Введите последнее число диапазона: ");
        Integer max = getNumber();

        //вызов метода для создания случайного числа
        int randomNumber = randomGenerator(min, max);

        //метод угадывания и вывода инфо
        guessTheNumber(randomNumber, min, max);

    }

    private static void guessTheNumber(int randomNumber, int min, int max) {
        System.out.println("Угадай число от " + min + " до " + max);
        int i = -1;//переменная для старта цикла и вне диапазона

        while (randomNumber != i) {
            System.out.println("Введите число: ");
            Integer inputNumber = getNumber();
            i = inputNumber;
        }

        System.out.println("ПОБЕДА! Вы угадали число! Компьютер загадал: " + randomNumber);
    }

    //генератор чисел с вводимым диапазоном
    private static int randomGenerator(int max, int min) {
        double random = Math.random();
        int r2 = (int) ((random * (max - min)) + min);
        return r2;
    }

    //проверка на цифры
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
