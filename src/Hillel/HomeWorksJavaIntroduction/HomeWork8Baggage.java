package Hillel.HomeWorksJavaIntroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork8Baggage {
    public static void main(String[] args) throws IOException {

        //initialization of buffer reader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //intro

        System.out.println("Let's check your bag size!");
        System.out.println("\u22b3 Enter height of your bag: ");
        int height = Integer.parseInt(reader.readLine()); //read from console height

        System.out.println("\u22b3 Enter width of your bag: ");
        int width = Integer.parseInt(reader.readLine()); //read from console width

        System.out.println("\u22b3 Enter depth of your bag: ");
        int depth = Integer.parseInt(reader.readLine()); //read from console depth

        //display your sizes
        System.out.println("Total size is: " + height + "x" + width + "x" + depth + " cm");
        System.out.println("Limits are 40x55x20 (cm) or 53x40x22 (cm)");

        //checking with first max size of 40x55x20

        if ((height > 0 && height <= 40) && (width > 0 && width <= 55) && (depth > 0 && depth <= 20)) {
            System.out.println("\u24c8\u24e4\u24df\u24d4\u24e1  Your bag accepted by cabin!");
        }

        //checking with second size of 53x40x22

        else if ((height > 0 && height <= 53) && (width > 0 && width <= 40) && (depth > 0 && depth <= 22)) {
            System.out.println("Good choice! Your bag accepted by cabin!");

        //Any other bags
        } else System.out.println("\u2717 You bag is too big! Put your baggage to aircraft luggage");

        //this is the end of program
    }
}
