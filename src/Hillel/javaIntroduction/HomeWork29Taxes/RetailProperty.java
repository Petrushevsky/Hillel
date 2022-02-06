package Hillel.javaIntroduction.HomeWork29Taxes;

public class RetailProperty extends Realty {
    private String name = "Торговая недвижимость";
    private float sales;

    public RetailProperty() {
    }

    public RetailProperty(float tax, float square, float sales) {
        super.tax = tax;
        super.square = square;
        this.sales = sales;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public float taxes() {
        if (sales > 100) {
            float taxes = (square / 100) * tax;
            return taxes;
        } else return 0;
    }
}
