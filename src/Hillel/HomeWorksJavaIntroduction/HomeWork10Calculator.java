package Hillel.HomeWorksJavaIntroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork10Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Let's calculate!");
        System.out.println("Enter 1st digit: ");

        int d1 = Integer.parseInt(bufferedReader.readLine()); //The First digit for calculator

        System.out.println("Operation (-,+,*,/):");

        String operation = bufferedReader.readLine(); //Operation Math

        System.out.println("Enter 2nd digit: ");
        int d2 = Integer.parseInt(bufferedReader.readLine()); //Second digit

    //method of calculating
        calculation(d1, operation, d2);
    }


    private static void calculation(int digit1, String mathFunction, int digit2) {
        double result = 0;//For resulting purposes
        if (mathFunction.equals("-")) {
            result = digit1 - digit2;
        } else if (mathFunction.equals("+")) {
            result = digit1 + digit2;
        } else if (mathFunction.equals("*")) {
            result = digit1 * digit2;
        } else if (mathFunction.equals("/")) {
            result = (double) digit1 / digit2;
        } else {
            System.out.println("Unknown operation! Try again!");
        }
        System.out.println("Result is: " + result);
        System.out.println("It WORKS!!!");
    }
}
