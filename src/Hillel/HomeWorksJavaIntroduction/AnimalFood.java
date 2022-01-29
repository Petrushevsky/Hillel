package Hillel.HomeWorksJavaIntroduction;

import java.util.Scanner; // импорт сканнера

public class AnimalFood {
    public static void main(String[] args) {
        //We enter all variables of Home task #7 to console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter quantity of DOGS: ");
        int dogAmount = scanner.nextInt();
        System.out.println("Enter quantity of CATS: ");
        int catAmount = scanner.nextInt();
        System.out.println("Enter weight of one portion, Gramms: ");
        int portionWeight = scanner.nextInt();
        System.out.println("Price of one portion, $: ");
        int portionPrice = scanner.nextInt();
        System.out.println("How many times animal will eat per day: ");
        int foodPerDay = scanner.nextInt();
        System.out.println("Enter total amount of DAYS: ");
        int days = scanner.nextInt();

        //We calculating number of portions per one Animal
        int totalPortionsOneAnimal = portinCalculating(days, foodPerDay);

        //using methods we calculate total weight
        long totalCatsFoodWeight = foodWeightCalculating(catAmount, totalPortionsOneAnimal, portionWeight);
        long totalDogsFoodWeight = foodWeightCalculating(dogAmount, totalPortionsOneAnimal, portionWeight);

        // we need to know total amount of animals
        int sumAnimals = catAmount + dogAmount;

        //now we get total price
        long totalCost = moneyCalculating(sumAnimals, totalPortionsOneAnimal, portionPrice);

        //we show our results to console
        System.out.println("Dogs will need: " + totalDogsFoodWeight + " Gramms of food");
        System.out.println("Cats will need: " + totalCatsFoodWeight + " Gramms of food");
        System.out.println("Tatal sum of money is : " + totalCost + "$");


    }

    public static int portinCalculating(int days, int howOftenAnimalEat) {
        return (days * howOftenAnimalEat);
    }

    public static int foodWeightCalculating(int animalAmount, int numberOfPortions, int portionWeight) {
        return (((portionWeight * numberOfPortions)) * animalAmount);
    }

    public static int moneyCalculating(int numberOfAnimals, int numberOfPortions, int priceOfOne) {
        return ((numberOfPortions * priceOfOne) * numberOfAnimals);
    }
}


