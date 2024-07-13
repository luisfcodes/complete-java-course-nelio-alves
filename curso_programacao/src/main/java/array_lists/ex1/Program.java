package array_lists.ex1;

import java.util.Scanner;

public class Program {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Quantos números você deseja adicionar a lista? (Max 10) ");
        int n = sc.nextInt();

        while (n > 10) {
            System.out.print("O valor máximo é 10, digite a quantidade novamente: ");
            n = sc.nextInt();
        }

        int[] myList = new int[n];

        for (int i = 0;i < myList.length;i++){
            System.out.print("Digite o número inteiro: ");
            int number = sc.nextInt();
            myList[i] = number;
        }

        Negatives negatives = new Negatives(myList);
        negatives.searchNegativeNumbers();

        sc.close();
    }
}
