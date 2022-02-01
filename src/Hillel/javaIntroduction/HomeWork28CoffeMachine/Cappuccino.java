package Hillel.javaIntroduction.HomeWork28CoffeMachine;

public class Cappuccino extends Drinks {
    public Cappuccino() {}
    private int price = 50;

    @Override
    public void create() {
        System.out.println("Cappuccino created! price - " + price +"$");
    }
    public int getPrice(){
        return price;
    }

}


