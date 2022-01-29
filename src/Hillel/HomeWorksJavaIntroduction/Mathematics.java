package Hillel.HomeWorksJavaIntroduction;

public class Mathematics {
    public static void main(String[] args) {
        //| a - b | / (a + b) ^3 - √c
        int a = 20;
        int b = 10;
        int c = 16;
        double result = ((Math.abs(a - b)) / Math.pow((a + b) , 3)) - Math.sqrt(c);
        System.out.println("Result is: " + result);
    }
}
