package Util;

public class CurrencyConvert {
    public static final double IOF = 0.06;

    public static double totalTax(double dollarPrice, double quantityDollar) {
        return dollarPrice * quantityDollar * IOF;
    }
    public static double dollarToBrl(double dollarPrice, double quantityDollar) {
        return (dollarPrice * quantityDollar) + totalTax(dollarPrice, quantityDollar);
    }
}
