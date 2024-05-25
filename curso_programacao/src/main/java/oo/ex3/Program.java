package oo.ex3;

import java.util.Scanner;

public class Program {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Student student = new Student();

        System.out.print("Informe seu nome: ");
        student.name = sc.nextLine();

        System.out.print("Informe a nota do primeiro trimestre: ");
        student.firstQuarterGrade = sc.nextDouble();

        System.out.print("Informe a nota do segundo trimestre: ");
        student.secondQuarterNote = sc.nextDouble();

        System.out.print("Informe a nota do terceiro trimestre: ");
        student.thirdQuarterNote = sc.nextDouble();

        student.getFinalGrade();

        student.getApprovalResult();

        sc.close();
    }
}
