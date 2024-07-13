package array_lists.ex5;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static final Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        System.out.print("Quantas pessoas você deseja adicionar a lista? (Min 2) - (Max 10) ");
        int n = sc.nextInt();

        while (n < 2 || n > 10) {
            System.out.print("O valor máximo é 10, digite a quantidade novamente: ");
            n = sc.nextInt();
        }

        double[] list = new double[n];

        for (int i = 0;i < list.length;i++){
            System.out.print("Digite um número: ");
            list[i] = sc.nextDouble();
        }

        showGreaterValue(list);

        sc.close();
    }

    private static void showGreaterValue(double[] list) {
        double greaterValue = 0;
        int indexOfGreaterValue = 0;

        for(int i = 1; i < list.length;i++) {
            if(list[i] > list[i - 1]){
                greaterValue = list[i];
                indexOfGreaterValue = i;
            }
        }
        System.out.printf("MAIOR VALOR = %.2f%n", greaterValue);
        System.out.printf("POSIÇÃO DO MAIOR VALOR = %d", indexOfGreaterValue);
    }
}
