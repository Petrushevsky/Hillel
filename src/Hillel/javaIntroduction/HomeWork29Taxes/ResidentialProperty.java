package Hillel.javaIntroduction.HomeWork29Taxes;

public class ResidentialProperty extends Realty {
    private float subs;
    private String name = "Жилая недвижимость";
    public ResidentialProperty() {
    }

    public ResidentialProperty(float tax, float square, float subs) {
        super.tax = tax;
        super.square = square;
        this.subs = subs;
    }

    @Override
    public String toString(){
        return name;
    }
    @Override
    public float taxes() {
        float taxes = (((square / 100) * tax) / 100) * subs;
        return taxes;
    }
}
