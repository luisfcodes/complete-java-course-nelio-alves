package oo.ex4;

public class CurrencyConverter {

    public static void getAmountToBePaidInReais(double dollarPrice, double amountOfDollars) {
        double convertDollarsInReais = amountOfDollars * dollarPrice;
        double iofTax = 0.06;
        double calc = (convertDollarsInReais * iofTax) + convertDollarsInReais;

        System.out.printf("Amount to be paid in reais = %.2f", calc);
    }

}
