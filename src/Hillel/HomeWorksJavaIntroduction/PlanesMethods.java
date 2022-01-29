package Hillel.HomeWorksJavaIntroduction;

import java.util.Scanner; // scanner import

public class PlanesMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //first
        System.out.println("FIRST PLANE - FIGHTER PLANE");
        System.out.println("Enter name of the plane: ");
        String planeNameInput = scanner.nextLine(); //read from console
        System.out.println("Enter Board number: ");
        String BoardInput = scanner.nextLine(); //read from console
        System.out.println("Enter model of the plane: ");
        String planeModelInput = scanner.nextLine();//read from console
        System.out.println(printAirplaneInfo(planeNameInput, BoardInput, planeModelInput)); //Method with 3 variables
        //second
        System.out.println("SECOND - PASSENGER PLANE");
        System.out.println("Enter name of the plane: ");
        planeNameInput = scanner.nextLine();//read from console
        System.out.println("Enter Board number: ");
        BoardInput = scanner.nextLine(); //read from console
        System.out.println("Enter model of the plane: ");
        planeModelInput = scanner.nextLine();//read from console
        System.out.println("Enter number of economy class seats: ");
        String planeEconomySeats = scanner.nextLine();
        System.out.println(printAirplaneInfo(planeNameInput, BoardInput, planeModelInput, planeEconomySeats));//Same method with 4 variables
        //third
        System.out.println("THIRD - PASSENGER PLANE");
        System.out.println("Enter name of the plane: ");
        planeNameInput = scanner.nextLine();//read from console
        System.out.println("Enter Board number: ");
        BoardInput = scanner.nextLine(); //read from console
        System.out.println("Enter model of the plane: ");
        planeModelInput = scanner.nextLine();//read from console
        System.out.println("Enter number of economy class seats: ");
        planeEconomySeats = scanner.nextLine();//read from console
        System.out.println("Enter number of business class seats: ");
        String planeBusinessSeats = scanner.nextLine();//read from console
        System.out.println(printAirplaneInfo(planeNameInput, BoardInput, planeModelInput, planeEconomySeats, planeBusinessSeats));//Same method with 5 variables

    }

    public static String printAirplaneInfo(String planeName, String board, String planeModel) {
        return (String) ("RESULT: Plane name: " + planeName + ", model: " + planeModel + ", board number: " + board);
    }

    public static String printAirplaneInfo(String planeName, String board, String planeModel, String planeEconomSeats) {
        return (String) ("RESULT: Plane name: " + planeName + ", model: " + planeModel + ", board number: " + board + ", economy passengers seats: " + planeEconomSeats);
    }

    public static String printAirplaneInfo(String planeName, String board, String planeModel, String planeEconomSeats, String planeBusinessSeats) {
        return (String) ("RESULT: Plane name: " + planeName + ", model: " + planeModel + ", board number: " + board + ", economy passengers seats: " + planeEconomSeats + ", VIP passengers seats: " + planeBusinessSeats);
    }
}
