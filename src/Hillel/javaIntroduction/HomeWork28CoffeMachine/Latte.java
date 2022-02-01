package Hillel.javaIntroduction.HomeWork28CoffeMachine;

public class Latte extends Drinks{
    public int quantity;
    private int price = 45;

    @Override
    public void create() {
        System.out.println("Latte created! price - " + price +"$");
    }
    public int getPrice(){
        return price;
    }
}
