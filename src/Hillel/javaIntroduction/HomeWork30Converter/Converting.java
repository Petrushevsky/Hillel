package Hillel.javaIntroduction.HomeWork30Converter;

public class Converting {
    public static void main(String[] args) {
        System.out.println("Введите число градусов по цельсию:");
        int temperature = ConsoleInputCheck.getNumber();
        int type = ConsoleInputCheck.getMenuItem();
        Items converting = new Items(temperature,type);
        converting.convert();
    }

}
