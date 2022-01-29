package Hillel.javaIntroduction;

public class lesson2_HomeWork {
    /*
    Hello dear Mariana!
    It's home task for lesson 2.
    Part A:
    First task is to show 2 variables of latitude and longitude of my home and some famous places.
    My home: 46.466390315648695, 30.70943899574137
    Hollywood Sign: 34.13426110510346, -118.32074314333966
    The Eiffel Tower: 48.85847596033094, 2.2944920271367204
    * */
    public static void main(String[] args) {
        //Let's start, we make float variables
        float homeLatitude = 46.466390315648695F;
        float homeLongitude = 30.70943899574137F;
        float hollywoodLatitude = 34.13426110510346F;
        float hollywoodLongitude = -118.32074314333966F;
        float eiffelLatitude = 48.85847596033094F;
        float eiffelLongitude = 2.2944920271367204F;
        //now we print results in console
        System.out.println("Home task for lesson 2!");
        System.out.println("####################    PART A    ##############################");
        System.out.println("Coordinates:");
        System.out.println("My Home: " + homeLatitude + ", " + homeLongitude);
        System.out.println("Hollywood Sign: " + hollywoodLatitude + ", " + hollywoodLongitude);
        System.out.println("The Eiffel Tower: " + eiffelLatitude + ", " + eiffelLongitude);
        System.out.println("End of part A!");
        System.out.println("################### End of part A! ###########################");
        System.out.println();
        /*
    Part B:
    You have 2 variables A and B, print them in console, and change their values from A to B and from B to A, then print them in console
    */
        //We made 2 int variables
        System.out.println("####################    PART B    ##############################");
        int varA = 100_500;
        System.out.println("Variable A: " + varA);
        int varB = 300;
        int varC; //temporary variable for saving value of A for next purposes
        System.out.println("Variable B: " + varB);
        varC = varA;
        varA = varB;
        varB =  varC; //value of variable A
        System.out.println("We made some changes ^_^ ");
        System.out.println("New value A: " + varA);
        System.out.println("VNew value B: " + varB);
        System.out.println("################### End of part B! ###########################");





    }
}
