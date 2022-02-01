package Hillel.javaIntroduction.HomeWork28CoffeMachine;

public class Americano extends Drinks{
    private int price = 35;

    @Override
    public void create() {
        System.out.println("Americano created! price - " + price +"$");
    }
    public int getPrice(){
        return price;
    }
}
