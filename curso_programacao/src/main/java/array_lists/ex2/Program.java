package array_lists.ex2;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));

        System.out.print("Quantos números você deseja adicionar a lista? (Max 10) ");
        int n = sc.nextInt();

        while (n > 10) {
            System.out.print("O valor máximo é 10, digite a quantidade novamente: ");
            n = sc.nextInt();
        }

        double[] myList = new double[n];

        for (int i = 0;i < myList.length;i++){
            System.out.print("Digite o número real: ");
            double number = sc.nextDouble();
            myList[i] = number;
        }

        Sum_Vector sumVector = new Sum_Vector(myList);
        sumVector.showAllNumbers();
        sumVector.showSumAllNumbers();
        sumVector.showAverageAllNumbers();


        sc.close();
    }
}

