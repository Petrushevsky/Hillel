package Hillel.javaIntroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork11Min {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));//buffer reader init

        int[] numbers = new int[3]; //new massive for numbers

        System.out.println("#########  Let's find min and max Values! ##########");

        //input numbers to int massive numbers

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter " + (i + 1) + " number:");
            numbers[i] = Integer.parseInt(bufferedReader.readLine()); //The First digit for calculator
        }

        //using method to calculate maximum
        int resultMax = maximumValue(numbers);

        //using method to calculate minimum value
        int resultMin = minimumValue(numbers);

        //Output
        System.out.println("#####################    RESULT   ####################");
        System.out.println("Max Value: " + resultMax);
        System.out.println("Min Value: " + resultMin);


    }

    //END
    private static int maximumValue(int[] numbers) {
        int maxValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }

    private static int minimumValue(int[] numbers) {
        int minValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        return minValue;
    }
}
