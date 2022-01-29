package Hillel.javaIntroduction;
/**
 * ДЗ 16. Копирование массива
 * 1. Создать массив на 20 чисел.
 * 2. Ввести в него значения с консоли.
 * 3. Создать два массива на 10 чисел каждый.
 * 4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HomeWork16CopyArrays {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Input size of array, Enter ONLY EVEN numbers! for example 20:");
        int sizeOfArray = getNumber();
        //checking only even numbers for nice separating
        while (sizeOfArray % 2 != 0) {
            System.out.println("Enter ONLY EVEN numbers!:");
            sizeOfArray = getNumber();
        }

        //arrays
        int[] array20Nmbers = new int[sizeOfArray];
        int[] array10NumbersA = new int[sizeOfArray / 2];
        int[] array10NumbersB = new int[sizeOfArray / 2];

        System.out.println("You should enter " + sizeOfArray + " times the numbers to array");

        //fill arrays

        fillArrays(array20Nmbers);

        //copy to 2 new 10 digits arrays

        copyArrayTo(array20Nmbers, array10NumbersA, 0);
        copyArrayTo(array20Nmbers, array10NumbersB, (sizeOfArray / 2));

        //show results

        System.out.println("Full Array of 20 digits: " + Arrays.toString(array20Nmbers));
        System.out.println("New array of FIRST 10 digits: " + Arrays.toString(array10NumbersA));
        System.out.println("New array of LAST 10 digits: " + Arrays.toString(array10NumbersB));

    }

    private static void copyArrayTo(int[] arrayCopyFrom, int[] arrayCopyTo, int position) {
        for (int i = 0; i < arrayCopyTo.length; i++) {
            arrayCopyTo[i] = arrayCopyFrom[i + position];

            //fill new 10 digit array

        }
    }

    private static void fillArrays(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = getNumber();
        }
    }

    private static Integer getNumber() {
        try {
            System.out.println("input only number: ");
            String str = READER.readLine();
            return Integer.parseInt(str);
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
            return getNumber();
        }
    }
}
