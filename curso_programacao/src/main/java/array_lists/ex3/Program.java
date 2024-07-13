package array_lists.ex3;

import java.util.Arrays;
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

            System.out.print("Altura: ");
            double height = sc.nextDouble();
            sc.nextLine();

            personList[i] = new Person(name, age, height);
        }

        for(int i = 0; i < personList.length; i++) {
            personList[i].getPersonData(i + 1);
        }

        calculateAndShowAverageHeight(personList);
        showPeopleUnderSixteen(personList);
    }

    private static void calculateAndShowAverageHeight(Person[] personList) {
        double heightSum = 0;
        for (Person person : personList) {
            heightSum += person.getHeight();
        }

        System.out.printf("Altura média: %.2f%n", heightSum / personList.length);
    }

    private static void showPeopleUnderSixteen(Person[] personList) {
        Person[] listOfPeopleUnderSixteen = Arrays.stream(personList).filter(person -> person.getAge() < 16).toArray(Person[]::new);

        double percentageUnderSixteen = ((double) listOfPeopleUnderSixteen.length / personList.length) * 100.0;

        System.out.printf("Pessoas com menos de 16 anos: %.2f%%%n", percentageUnderSixteen);
        for(Person person : listOfPeopleUnderSixteen) {
            System.out.println(person.getName());
        }
    }
}
