package Hillel.javaIntroduction.HomeWork28CoffeMachine;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {

    public static void main(String[] args) {

        Drinks CappuccinoDrink = new Cappuccino();
        Drinks TeaDrink = new Tea();
        Drinks AmericanoDrink = new Americano();
        Drinks LatteDrink = new Latte();

        List<Drinks> drinks = new ArrayList<>();

        System.out.println("Main menu. Choose your drink number, and press ENTER:");

        int menuItem = getMenuItem(); //считываем с консоли число из меню

        while (menuItem != 0) {
            switch (menuItem) {
                case 1:
                    System.out.println("========================================================");
                    System.out.println("Tea added!");
                    //System.out.println("========================================================");
                    drinks.add(TeaDrink);
                    break;
                case 2:
                    System.out.println("========================================================");
                    System.out.println("Latte added!");
                    //System.out.println("========================================================");
                    drinks.add(LatteDrink);
                    break;
                case 3:
                    System.out.println("========================================================");
                    System.out.println("Cappuccino added!");
                    drinks.add(CappuccinoDrink);
                    break;
                case 4:
                    System.out.println("========================================================");
                    System.out.println("Americano added!");
                    drinks.add(AmericanoDrink);
                    break;
            }
            menuItem = getMenuItem();

        }
        System.out.println("========================================================");
        System.out.println("Lets create coffee");
        System.out.println("========================================================");
        CalculatePriceCreateCoffee(drinks);


    }

    private static int getMenuItem() {
        System.out.println("========================================================");
        System.out.println("Select or add another drink:");
        System.out.println("1. Tea");
        System.out.println("2. Latte");
        System.out.println("3. Cappuccino");
        System.out.println("4. Americano");
        System.out.println("0. Exit");
        System.out.println("========================================================");
        int menuItem = ConsoleInputCheck.getNumber();
        while (menuItem < 0 || menuItem >= 5) {
            System.out.println("Input numbers from 0 to 4");
            menuItem = ConsoleInputCheck.getNumber();
        }
        return menuItem;
    }

    private static void CalculatePriceCreateCoffee(List<Drinks> drinks) {
        int totalPrice = 0;
        for (Drinks drink : drinks) {
            drink.create();
            totalPrice += drink.getPrice();
        }
        System.out.println("Total price: " + totalPrice+"$");
        System.out.println("========================================================");
    }
}
