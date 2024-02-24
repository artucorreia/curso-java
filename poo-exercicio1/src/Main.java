import Util.CurrencyConvert;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = scan.nextDouble();

        System.out.print("How many dollars will be bought: ");
        double quantityDollar = scan.nextDouble();

        System.out.println(CurrencyConvert.dollarToBrl(dollarPrice, quantityDollar));

        scan.close();
    }
}