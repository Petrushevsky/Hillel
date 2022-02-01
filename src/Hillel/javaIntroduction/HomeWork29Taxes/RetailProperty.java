package Hillel.javaIntroduction.HomeWork29Taxes;

public class RetailProperty extends Realty {
    private float tax;
    private float sales;
    private float square;

    public RetailProperty() {
    }

    public RetailProperty(float tax, float sales, float square) {
        this.tax = tax;
        this.sales = sales;
        this.square = square;
    }

    @Override
    public void taxes() {

        if (sales > 100) {
            float taxes = (square / 100) * tax;
            System.out.println("Налог на торговую недвижимость составляет " + taxes + "$");
        } else System.out.println("Выручка меньше 100$, невозможно посчитать налог для торговой недвижимости");


    }
}
