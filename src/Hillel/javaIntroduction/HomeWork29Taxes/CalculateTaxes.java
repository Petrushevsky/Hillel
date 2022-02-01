package Hillel.javaIntroduction.HomeWork29Taxes;

import Hillel.javaIntroduction.HomeWork28CoffeMachine.ConsoleInputCheck;
import Hillel.javaIntroduction.HomeWork28CoffeMachine.Drinks;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class CalculateTaxes {
    public static void main(String[] args) {
        System.out.println("Введите налог на недвижимость, %");
        int tax = ConsoleInputCheck.getNumber();
        System.out.println("Введите площадь производственной недвижимости");
        int industrialSquare = ConsoleInputCheck.getNumber();
        System.out.println("Введите площадь жилой недвижимости");
        int residentialSquare = ConsoleInputCheck.getNumber();
        System.out.println("Введите субсидию на жилую недвижимость, %");
        int subsidy = ConsoleInputCheck.getNumber();
        System.out.println("Введите площадь торговой недвижимости");
        int retailSquare = ConsoleInputCheck.getNumber();
        System.out.println("Введите выручку торговой недвижимости");
        int sales = ConsoleInputCheck.getNumber();

        Realty Industrial = new IndustrialProperty(tax, industrialSquare);
        Realty Retail = new RetailProperty(tax, sales, retailSquare);
        Realty Residential = new ResidentialProperty(tax, subsidy, residentialSquare);

        List<Realty> realtyTaxes = new ArrayList<>();
        realtyTaxes.add(Industrial);
        realtyTaxes.add(Retail);
        realtyTaxes.add(Residential);

        for (Realty realty : realtyTaxes) {
            System.out.println("==============================================");
            realty.taxes();
        }
        System.out.println("===================== END =====================");
    }
}
