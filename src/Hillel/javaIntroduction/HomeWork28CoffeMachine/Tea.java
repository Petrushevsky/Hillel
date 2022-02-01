package Hillel.javaIntroduction.HomeWork28CoffeMachine;

public class Tea extends Drinks{
    public int quantity;
    private int price = 10;

    @Override
    public void create() {
        System.out.println("Tea created! price - " + price +"$");
    }
    public int getPrice(){
        return price;
    }
}
