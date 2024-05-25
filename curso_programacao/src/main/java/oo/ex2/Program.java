package oo.ex2;

import java.util.Scanner;

public class Program {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();

        System.out.print("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.print("Tex: ");
        employee.tax = sc.nextDouble();

        System.out.printf("Employee: %s, R$ %.2f\n", employee.name, employee.netSalary());

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();

        employee.increaseSalary(percentage);

        System.out.printf("Updated data: %s, R$ %.2f\n", employee.name, employee.netSalary());

        sc.close();
    }
}
