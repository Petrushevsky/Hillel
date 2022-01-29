package Hillel.javaIntroduction;

public class Snowman {
    public static void main(String[] args) {
        //Base parameters of the task
        double radius1 = 1;
        double radius2 = 0.5F;
        double radius3 = 0.2F;
        double density = 0.7F;
        //We calculate weight of each ball, by formula Weight=((4/3)*Pi*(Radius^3))*density
        double weight1 = (((4.0/3)*Math.PI*Math.pow(radius1,3))*density); //first biggest ball
        double weight2 = (((4.0/3)*Math.PI*Math.pow(radius2,3))*density); //weight of the second ball
        double weight3 = (((4.0/3)*Math.PI*Math.pow(radius3,3))*density); // third
        //Next we summ all of the ball weights
        double totalWeight = weight1 + weight2 + weight3;
        //We show result of the task
        System.out.println("Total weight of Snowman is: " + totalWeight + " (KG)");
        //Total weight of Snowman is: 3.3221294558891774 (KG)
    }

}
