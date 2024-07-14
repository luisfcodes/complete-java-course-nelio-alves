package array_lists.ex7;

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

        double[] vector = new double[n];

        for (int i = 0; i < vector.length; i++){
            System.out.print("Digite um número: ");
            vector[i] = sc.nextDouble();
        }

        double avg = 0;

        for (double v : vector) {
            avg += v;
        }

        avg = avg / vector.length;

        System.out.printf("MÉDIA DO VETOR = %.3f%n", avg);

        int count = 0;

        for (double v : vector) {
            if (v < avg) {
                count++;
            }
        }

        double[] elementsBelowAvg = new double[count];

        int j = 0;

        for (double v : vector) {
            if (v < avg) {
                elementsBelowAvg[j] = v;
                j++;
            }
        }

        System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
        Arrays.stream(elementsBelowAvg).forEach(System.out::println);

        sc.close();
    }
}
