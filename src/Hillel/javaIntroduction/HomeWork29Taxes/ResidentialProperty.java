package Hillel.javaIntroduction.HomeWork29Taxes;

public class ResidentialProperty extends Realty {
    private float tax;
    private float subs;
    private float square;

    public ResidentialProperty() {
    }

    public ResidentialProperty(float tax, float subs, float square) {
        this.tax = tax;
        this.subs = subs;
        this.square = square;
    }

    @Override
    public void taxes() {
        float taxes = (((square / 100) * tax) / 100) * subs;
        System.out.println("Налог на жилую недвижимость составляет " + taxes + "$");

    }
}
