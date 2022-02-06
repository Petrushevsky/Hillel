package Hillel.javaIntroduction.HomeWork29Taxes;

class Realty {
    protected float tax;
    protected float square;
    public static String NAME = "недвижимость";
    public Realty(){}
    public Realty(float square, float tax){
        this.square = square;
        this.tax = tax;
    }


    public float taxes(){
        float taxesTotal = (square / 100) * tax;
        return taxesTotal;
    }

}
