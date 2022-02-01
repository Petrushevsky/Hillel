package Hillel.javaIntroduction.HomeWork29Taxes;

public class IndustrialProperty extends Realty {
    private float tax;
    private float square;

    public IndustrialProperty() {
    }

    public IndustrialProperty(float tax, float square) {
        this.tax = tax;
        this.square = square;
    }


    @Override
    public void taxes() {
        float taxes = (square / 100) * tax;
        System.out.println("Налог на производственную недвижимость составляет " + taxes + "$");
    }
}
