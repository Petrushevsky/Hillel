package Hillel.javaIntroduction.HomeWork29Taxes;

public class IndustrialProperty extends Realty {
    private String name = "Производственная недвижимость";

    public IndustrialProperty() {
    }

    public IndustrialProperty(float tax, float square) {
        super.tax = tax;
        super.square = square;
    }

    @Override
    public float taxes() {
        return super.taxes();
    }

    @Override
    public String toString() {
        return name;
    }

}



