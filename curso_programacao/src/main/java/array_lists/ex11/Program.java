package array_lists.ex11;

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

        for (int i = 0; i < personList.length; i++){
            System.out.printf("Altura da %da pessoa: ", i + 1);
            double height = sc.nextDouble();

            System.out.printf("Gênero da %da pessoa (M/F): ", i + 1);
            char gender = sc.next().toUpperCase().charAt(0) == 'M' ? 'M' : 'F';
            sc.nextLine();

            personList[i] = new Person(gender, height);
        }

        for (int i = 0; i < personList.length; i++) {
            personList[i].getPersonData(i + 1);
        }

        calculateSmallestAndGreatestHeight(personList);
        calculateAvgHeightOfWomen(personList);
        calculateTheNumberOfMen(personList);

        sc.close();
    }

    private static void calculateSmallestAndGreatestHeight(Person[] personList) {
        double smallestHeight = Double.MAX_VALUE;
        double greatestHeight = Double.MIN_VALUE;

        for (Person person : personList) {
            if (person.getHeight() < smallestHeight) {
                smallestHeight = person.getHeight();
            }

            if (person.getHeight() > greatestHeight) {
                greatestHeight = person.getHeight();
            }
        }

        System.out.printf("Menor altura = %.2f%n", smallestHeight);
        System.out.printf("Maior altura = %.2f%n", greatestHeight);
    }

    private static void calculateAvgHeightOfWomen(Person[] personList) {
        double sum = 0;
        int count = 0;

        for (Person person : personList) {
            if (person.getGender() == 'F') {
                sum += person.getHeight();
                count++;
            }
        }

        double avg = sum / count;
        System.out.printf("Média de altura das mulheres = %.2f%n", avg);
    }

    private static void calculateTheNumberOfMen(Person[] personList) {
        int count = 0;

        for (Person person : personList) {
            if (person.getGender() == 'M') {
                count++;
            }
        }

        System.out.printf("Número de homens = %d%n", count);
    }
}
