import java.util.Scanner;

public class SequentialStructureExercises {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();

        sc.close();
    }

    private static void exercise1() {
        // Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        //mensagem explicativa, conforme exemplos.

        System.out.print("Digite o primeiro número: ");
        int x = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int y = sc.nextInt();

        int sum = x + y;

        System.out.printf("A soma de %d e %d é %d", x, y, sum);
    }

    private static void exercise2(){
        //Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        //casas decimais conforme exemplos.
        //Fórmula da área: area = π . raio2
        //Considere o valor de π = 3.14159

        double pi = 3.14159;

        System.out.print("Digite o número: ");
        double x = sc.nextDouble();

        double calc = pi * Math.pow(x, 2);

        System.out.printf("O valor da área deste círculo é: %.4f", calc);
    }

    private static void exercise3(){
        //Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        //de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int difCalc = (a * b - c * d);

        System.out.printf("A diferença do produto A e B pelo produto C e D é de: %d", difCalc);
    }

    private static void exercise4() {
        //Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        //hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        //decimais.

        System.out.println("Informe sua matrícula");
        int register = sc.nextInt();

        System.out.println("Informe o número de horas trabalhadas");
        double workedHours = sc.nextDouble();

        System.out.println("Informe o valor de sua hora trabalhada");
        double hourlyRate = sc.nextDouble();

        double salaryCalc = workedHours * hourlyRate;

        System.out.printf("Foi computado o salário de R$%.2f para o funcionário %d", salaryCalc, register);
    }

    private static void exercise5() {
        //Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        //código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

        System.out.print("Informe o código da peça 1: ");
        int itemCodeOne = sc.nextInt();

        System.out.print("Informe a quantidade de peças 1: ");
        int quantityOfItemOne = sc.nextInt();

        System.out.print("Informe o valor unitário da peça 1: ");
        double unitValueOfItemOne = sc.nextDouble();

        System.out.print("Informe o código da peça 2: ");
        int itemCodeTwo = sc.nextInt();

        System.out.print("Informe a quantidade de peças 2: ");
        int quantityOfItemTwo = sc.nextInt();

        System.out.print("Informe o valor unitário da peça 2: ");
        double unitValueOfItemTwo = sc.nextDouble();

        double totalValueOfProductOne = quantityOfItemOne * unitValueOfItemOne;
        double totalValueOfProductTwo = quantityOfItemTwo * unitValueOfItemTwo;
        double totalValueOfProducts = totalValueOfProductOne + totalValueOfProductTwo;

        System.out.printf("O valor total da compra foi de: R$%.2f", totalValueOfProducts);
    }

    private static void exercise6() {
        //Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
        //mostre:
        //a) a área do triângulo retângulo que tem A por base e C por altura.
        //b) a área do círculo de raio C. (pi = 3.14159)
        //c) a área do trapézio que tem A e B por bases e C por altura.
        //d) a área do quadrado que tem lado B.
        //e) a área do retângulo que tem lados A e B.

        System.out.print("Informe o primeiro número: ");
        double a = sc.nextDouble();

        System.out.print("Informe o segundo número: ");
        double b = sc.nextDouble();

        System.out.print("Informe o terceiro número: ");
        double c = sc.nextDouble();

        double triangleArea = 0.5 * a * c;
        double circleArea = 3.14159 * Math.pow(c, 2);
        double trapezeArea = ((a + b) * c) / 2;
        double squareArea = Math.pow(b, 2);
        double rectangleArea = a * b;

        System.out.printf("TRIANGLE: %.3f%n", triangleArea);
        System.out.printf("CIRCLE: %.3f%n", circleArea);
        System.out.printf("TRAPEZE: %.3f%n", trapezeArea);
        System.out.printf("SQUARE: %.3f%n", squareArea);
        System.out.printf("RECTANGLE: %.3f%n", rectangleArea);
    }
}
