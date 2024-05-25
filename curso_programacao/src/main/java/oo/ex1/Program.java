package oo.ex1;

import java.util.Scanner;

public class Program {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        System.out.print("Informe a base do triângulo: ");
        rectangle.width = sc.nextDouble();

        System.out.print("Informe a altura do triângulo: ");
        rectangle.height = sc.nextDouble();

        double area = rectangle.area();
        double perimeter = rectangle.perimeter();
        double diagonal = rectangle.diagonal();

        System.out.printf("AREA = %.2f\n", area);
        System.out.printf("PERÍMETRO = %.2f\n", perimeter);
        System.out.printf("DIAGONAL = %.2f\n", diagonal);

        sc.close();
    }
}
