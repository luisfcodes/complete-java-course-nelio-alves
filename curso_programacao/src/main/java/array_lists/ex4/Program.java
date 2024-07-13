package array_lists.ex4;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static final Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        System.out.print("Quantas pessoas você deseja adicionar a lista? (Max 10) ");
        int n = sc.nextInt();

        while (n > 10) {
            System.out.print("O valor máximo é 10, digite a quantidade novamente: ");
            n = sc.nextInt();
        }

        int[] list = new int[n];

        for (int i = 0;i < list.length;i++){
            System.out.print("Digite um número: ");
            list[i] = sc.nextInt();
        }

        showPairNumbers(list);

        sc.close();
    }

    private static void showPairNumbers(int[] list) {
        int[] pairNumbersList = Arrays.stream(list).filter(number -> number % 2 == 0).toArray();
        System.out.println("NÚMEROS PARES:");
        for(int number : pairNumbersList) {
            System.out.printf("%d ", number);
        }
        System.out.println();
        System.out.printf("QUANTIDADE DE PARES = %d", pairNumbersList.length);
    }
}
