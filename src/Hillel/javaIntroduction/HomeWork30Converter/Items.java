package Hillel.javaIntroduction.HomeWork30Converter;

class Items implements Converter {
    float itemToConvert;
    int type;

    public Items(float itemToConvert, int type) {
        this.itemToConvert = itemToConvert;
        this.type = type;
    }

    @Override
    public void convert() {
        switch (type) {
            case 1: //Kelvin
                itemToConvert += 273.15;
                System.out.println("Результат конвертации:");
                System.out.println(itemToConvert + " - градусов по Кельвину");
                break;
            case 2: //Farengeit
                itemToConvert = itemToConvert * (9 / 5) + 32;
                System.out.println("Результат конвертации:");
                System.out.println(itemToConvert + " - градусов по Фаренгейту");

        }
    }
}
