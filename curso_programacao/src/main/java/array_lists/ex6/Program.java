package array_lists.ex6;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static final Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        System.out.print("Quantas valores terão cada vetor? (Min 2) - (Max 10) ");
        int n = sc.nextInt();

        while (n < 2 || n > 10) {
            System.out.print("O valor máximo é 10, digite a quantidade novamente: ");
            n = sc.nextInt();
        }

        int[] vectorOne = new int[n];
        int[] vectorTwo = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite o valor " + (i + 1) + " do vetor 1: ");
            vectorOne[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++){
            System.out.print("Digite o valor " + (i + 1) + " do vetor 2: ");
            vectorTwo[i] = sc.nextInt();
        }

        int[] sumVector = new int[n];

        for (int i = 0; i < n; i++){
            sumVector[i] = vectorOne[i] + vectorTwo[i];
        }

        System.out.println("VETOR RESULTANTE:");
        for(int number : sumVector){
            System.out.println(number);
        }

        sc.close();
    }
}
