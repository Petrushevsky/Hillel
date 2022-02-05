package Hillel.javaIntroduction.HomeWork30Converter;

public class Converting {
    public static void main(String[] args) {
        Kelvin convertingKelvin = new Kelvin();
        Fahrenheit convertingFahrenheit = new Fahrenheit();

        MyConsoleUtils.printLine();
        System.out.println("Введите число градусов по Цельсию, \u00b0C:");
        double temperature = MyConsoleUtils.getNumber();
        int type = MyConsoleUtils.getMenuItem();
        MyConsoleUtils.printLine();

        switch (type) {
            case 1://kelvin
                System.out.println("\u25b7 "+ temperature + " \u00b0C = " + convertingKelvin.convert(temperature) + "(K)");
                MyConsoleUtils.printLine();
                break;
            case 2:
                System.out.println("\u25b7 "+ temperature + " \u00b0C = " + convertingFahrenheit.convert(temperature) + " (F)");
                MyConsoleUtils.printLine();
                break;
        }

    }

}
