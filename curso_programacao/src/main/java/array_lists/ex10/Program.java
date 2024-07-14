package array_lists.ex10;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static final Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));

        System.out.print("Quantas alunos você deseja adicionar a lista? (Max 10) ");
        int n = sc.nextInt();

        while (n > 10) {
            System.out.print("O valor máximo é 10, digite a quantidade novamente: ");
            n = sc.nextInt();
        }

        Student[] studentsList = new Student[n];
        sc.nextLine();

        for (int i = 0;i < studentsList.length;i++){
            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Nota do primeiro semestre: ");
            double grade1 = sc.nextDouble();

            System.out.print("Nota do segundo semestre: ");
            double grade2 = sc.nextDouble();
            sc.nextLine();

            studentsList[i] = new Student(name, grade1, grade2);
        }

        System.out.println("Alunos aprovados:");
        Arrays.stream(studentsList).forEach(student -> {
            if (student.isApproved()) {
                System.out.printf("Nome: %s, Média: %.2f%n", student.getName(), student.getAverage());
            }
        });
    }
}
