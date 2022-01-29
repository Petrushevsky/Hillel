package Hillel.HomeWorksJavaIntroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Задан массив целых чисел. Поместить все нули в начало массива. Например дано {х,х,0,х,0,х}, в результате получаем {0,0,х,х,х,х}, порядок ненулевых чисел значения не имеет.
 */
public class HomeWork19ZerosToBegin {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        //create new array with user input
        System.out.println("Enter size of array");
        int sizeOfArray = getNumber();
        int[] numbers = new int[sizeOfArray];

        //User must input parameters of array
        System.out.println("Input max number to array randomly generated:");
        int max = getNumber();
        System.out.println("Input min number to array, for example 0: ");
        int min = getNumber();

        //fill array random numbers
        fillArrays(numbers, max, min);

        //sort array with Arrays.sort
        Arrays.sort(numbers);

        //Output to console
        System.out.println("Result is sorted array : "+Arrays.toString(numbers));
    }

    //fill array random numbers with parameters
    private static void fillArrays(int[] array, int max, int min) {
        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator(max, min);
        }
    }

    private static Integer getNumber() { //read from console with exceptions
        try {
            //System.out.println("input only number: ");
            String str = READER.readLine();
            return Integer.parseInt(str);
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
            return getNumber();
        }
    }

    private static int randomGenerator(int max, int min) { //random generator method
        double random = Math.random();
        int r2 = (int) ((random * (max - min)) + min);
        return r2;
    }

}
