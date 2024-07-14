package array_lists.ex8;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static final Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        System.out.print("Quantas elementos vai ter o vetor? (Min 2) - (Max 10) ");
        int n = sc.nextInt();

        while (n < 2 || n > 10) {
            System.out.print("O valor máximo é 10, digite a quantidade novamente: ");
            n = sc.nextInt();
        }

        int[] vector = new int[n];

        for (int i = 0; i < vector.length; i++){
            System.out.print("Digite um número: ");
            vector[i] = sc.nextInt();
        }

        int pairNumberCount = 0;

        for (int j : vector) {
            if (j % 2 == 0) {
                pairNumberCount++;
            }
        }

        int[] pairNumbers = new int[pairNumberCount];

        int index = 0;

        for (int j : vector) {
            if (j % 2 == 0) {
                pairNumbers[index] = j;
                index++;
            }
        }

        double avgPairNumbers = Arrays.stream(pairNumbers).average().orElse(0);

        if (avgPairNumbers == 0) {
            System.out.println("NENHUM NÚMERO PAR");
        } else {
            System.out.printf("MEDIA DOS PARES: %.2f", avgPairNumbers);
        }

        sc.close();
    }
}
