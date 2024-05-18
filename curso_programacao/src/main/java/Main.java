import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));

        System.out.println("Hello, World!");
        System.out.println("Bom dia!!!");

        int y = 32;
        int x = 10;

        System.out.println("Soma: " + (x + y));

        double z = 10.5;
        System.out.printf("Divisão: %.2f%n", (x / z));

        System.out.printf("A minha variavel y vale %d e a minha variavel x vale %d%n", y, x);

        String name = "Maria";
        int age = 31;
        double salary = 4000.0;

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", name, age, salary);

        exercise();
    }

    private static void exercise() {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println();
        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n", product2, price2);

        System.out.println();
        System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);

        System.out.println();
        System.out.printf("Measure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);
        System.out.printf("US decimal point: %.3f%n", measure);
    }

}
