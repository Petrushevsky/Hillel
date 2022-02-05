package Hillel.javaIntroduction.HomeWork30Converter;

class Fahrenheit implements Converter {

    @Override
    public double convert(double d2) {
        d2 = d2 * (9 / 5) + 32;
        return d2;
    }
}
