package oo.ex4;

import java.util.Scanner;

public class Program {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Informe a cotação do dólar: ");
        double dollarPrice = sc.nextDouble();

        System.out.print("Quando dólares você deseja converter: ");
        double amountOfDollars = sc.nextDouble();

        CurrencyConverter.getAmountToBePaidInReais(dollarPrice, amountOfDollars);

        sc.close();
    }

}
