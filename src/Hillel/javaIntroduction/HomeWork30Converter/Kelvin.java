package Hillel.javaIntroduction.HomeWork30Converter;

class Kelvin implements Converter {
   /* double itemToConvert;

    public Kelvin(double itemToConvert) {
        this.itemToConvert = itemToConvert;
    }*/
    @Override
    public double convert(double d1) {
        d1+= 273.15;
        return d1;
    }
}
