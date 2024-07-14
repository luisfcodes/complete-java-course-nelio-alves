package array_lists.ex9;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static final Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));

        System.out.print("Quantas pessoas você deseja adicionar a lista? (Max 10) ");
        int n = sc.nextInt();

        while (n > 10) {
            System.out.print("O valor máximo é 10, digite a quantidade novamente: ");
            n = sc.nextInt();
        }

        Person[] personList = new Person[n];
        sc.nextLine();

        for (int i = 0;i < personList.length;i++){
            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Idade: ");
            int age = sc.nextInt();
            sc.nextLine();

            personList[i] = new Person(name, age);
        }

        for(int i = 0; i < personList.length; i++) {
            personList[i].getPersonData(i + 1);
        }

        calculateTheOldestPerson(personList);

    }

    private static void calculateTheOldestPerson(Person[] personList) {
        int oldestPersonIndex = 0;
        int oldestPersonAge = personList[0].getAge();

        for (int i = 1; i < personList.length; i++) {
            if (personList[i].getAge() > oldestPersonAge) {
                oldestPersonAge = personList[i].getAge();
                oldestPersonIndex = i;
            }
        }

        System.out.printf("A pessoa mais velha é %s, com %d anos.%n", personList[oldestPersonIndex].getName(), personList[oldestPersonIndex].getAge());
    }
}
