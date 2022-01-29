package Hillel.HomeWorksJavaIntroduction;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
/**
 * Создать генератор паролей, который будет генерировать случайные неповторяющиеся пароли по следующим правилам:
 *
 * Пароль состоит из 8 символов
 *
 * В пароле допускаются только латинские большие и маленькие буквы, цифры и символ подчеркивания
 *
 * Пароль обязательно должен содержать большие и маленькие буквы и цифры
 */



public class HomeWork24PasswordGenerator {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Home Work24 Password Generator");
        System.out.println("Enter password length:");
        int passLength = getNumber();//вводим число длины пароля

        while (passLength <= 0 || passLength >50) { //проверяем чтобы длина была больше 0 и меньше 50 - сам так решил
            System.out.println("Numbers only bigger then Zero or lesser zhen 50");
            passLength = getNumber();
        }
        //иниц. класс
        passwordGenerator pass = new passwordGenerator();

        //делаем генерацию пароля и вывод в консоль 10 паролей уникальнЫх
        for (int i = 0; i < 10; i++) {
            pass.generate(passLength);
            System.out.println(pass);
        }


    }

    //метод с прошлых дз
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

class passwordGenerator {
    private String password;
    private String DICT = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_";//словарь символов цифр и подчеркивания

    public passwordGenerator() {
        System.out.println("Random generator started!!!");
        System.out.println();
    }

    public void generate(int passSize) {
        password = "";//обнуляем пароль
        Random random = new Random();
        int min = 0;
        int max = DICT.length();
        int sizeOfArray = passSize;//размер пароля = размеру массива случайных чисел
        int[] randomNumbers = new int[sizeOfArray];//массив для случайных чисел
        int randomNumber = randomGenerator(max, min); //идет выборка от 0 до размера словаря
        randomNumbers[0] = randomNumber;//присваиваем 0 индексу массива случайное число
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumber = randomGenerator(max, min);
            int searchNumber = search(randomNumbers, randomNumber);
            while (searchNumber > -1) {
                randomNumber = randomGenerator(max, min);
                searchNumber = search(randomNumbers, randomNumber);
            }
            randomNumbers[i] = randomNumber;
        }
        //создаём пароль на основе массива случайных неповторяющихся чисел конкатенацией
        for (int i = 0; i < randomNumbers.length; i++) {
            password += DICT.charAt(randomNumbers[i]);
        }
    }
//дз прошлые
    private int search(int[] numbers, int search) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                return i;
            }
        }
        return -1;
    }
    //дз прошлые
    private int randomGenerator(int max, int min) { //random generator method
        double random = Math.random();
        int r2 = (int) ((random * (max - min)) + min);
        return r2;
    }

    //вывод по феншую
    @Override
    public String toString() {
        return "Random password generated: " + password;
    }
}