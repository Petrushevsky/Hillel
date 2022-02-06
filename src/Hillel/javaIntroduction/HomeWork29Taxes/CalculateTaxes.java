package Hillel.javaIntroduction.HomeWork29Taxes;

import java.util.ArrayList;
import java.util.List;

public class CalculateTaxes {
    public static void main(String[] args) {
        System.out.println("Введите налог на недвижимость, %");
        int tax = MyConsoleUtils.getNumber();
        System.out.println("Введите площадь производственной недвижимости");
        int industrialSquare = MyConsoleUtils.getNumber();
        System.out.println("Введите площадь жилой недвижимости");
        int residentialSquare = MyConsoleUtils.getNumber();
        System.out.println("Введите субсидию на жилую недвижимость, %");
        int subsidy = MyConsoleUtils.getNumber();
        System.out.println("Введите площадь торговой недвижимости");
        int retailSquare = MyConsoleUtils.getNumber();
        System.out.println("Введите выручку торговой недвижимости");
        int sales = MyConsoleUtils.getNumber();

        Realty IndustrialZone1 = new IndustrialProperty(tax, industrialSquare);
        Realty RetailShop = new RetailProperty(tax, retailSquare, sales);
        Realty FlatKanatnayaStr69 = new ResidentialProperty(tax, residentialSquare, subsidy);

        List<Realty> realtyTaxes = new ArrayList<>();
        realtyTaxes.add(IndustrialZone1);
        realtyTaxes.add(RetailShop);
        realtyTaxes.add(FlatKanatnayaStr69);

        for (Realty realty : realtyTaxes) {
            System.out.println("==============================================");
            System.out.println("Налог на " + realty + " составляет " + realty.taxes() + "$");
        }
            System.out.println("===================== END =====================");
    }
}
