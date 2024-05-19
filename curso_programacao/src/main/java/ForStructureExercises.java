import java.util.Scanner;

public class ForStructureExercises {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] main) {

        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise7();

        sc.close();
    }

    public static void exercise1() {
        //Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
        //X, se for o caso.

        System.out.print("Escolha até qual número deseja saber os números ímpares: ");
        int interval = sc.nextInt();

        while (interval <= 0 || interval > 1000) {
            System.out.print("Valor informado inválido, selecione um intervalo entre 1 a 1000: ");
            interval = sc.nextInt();
        }

        for (int i = 0; i <= interval; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void exercise2() {
        //Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
        //Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
        //essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

        System.out.print("Informe quantos valores serão avaliados: ");
        int n = sc.nextInt();

        int numbersInRange = 0;
        int numbersOutOfRange = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Informe o valor desejado: ");
            int value = sc.nextInt();

            if (value >= 10 && value <= 20) {
                numbersInRange++;
            } else {
                numbersOutOfRange++;
            }
        }

        System.out.printf("%d in%n", numbersInRange);
        System.out.printf("%d out%n", numbersOutOfRange);
    }

    public static void exercise3() {
        //Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
        //em 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
        //conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
        //peso 5.

        System.out.print("Informe o número de casos de teste: ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Digite os três valores reais separados por espaço:");
            double valueOne = sc.nextDouble();
            double valueTwo = sc.nextDouble();
            double valueThree = sc.nextDouble();

            double weightedAverage = (valueOne * 2 + valueTwo * 3 + valueThree * 5) / (2 + 3 + 5);

            System.out.printf("Média ponderada: %.1f%n", weightedAverage);
        }
    }

    public static void exercise4() {
        //Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
        //segundo. Se o denominador for igual a zero, mostrar a mensagem "divisão impossível".

        System.out.print("Informe a quantidade de testes que serão feitos: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite os dois valores separados por espaço:");
            int dividend = sc.nextInt();
            int divisor = sc.nextInt();

            if (divisor == 0) {
                System.out.println("Divisão impossível!!!");
            } else {
                double result = (double) dividend / divisor;
                System.out.println(result);
            }
        }
    }

    public static void exercise5() {
        //Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
        //Lembrando que, por definição, fatorial de 0 é 1.

        System.out.print("Digite um número para calcular o fatorial: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("O fatorial não está definido para números negativos");
        } else {
            int fatorial = 1;
            for (int i = 1; i <= n; i++) {
                fatorial *= i;
            }

            System.out.println("O fatorial de " + n + " é: " + fatorial);
        }
    }

    public static void exercise6() {
        //Ler um número inteiro N e calcular todos os seus divisores.

        System.out.print("Digite um número inteiro para calcular seus divisores: ");
        int n = sc.nextInt();

        System.out.printf("Divisores de %d:\n", n);
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void exercise7() {
        //Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
        //começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
        //exemplo.

        System.out.print("Digite um número inteiro positivo: ");
        int n = sc.nextInt();

        System.out.println("Número | Quadrado | Cubo");
        for (int i = 1; i <= n; i++) {
            int quadrado = i * i;
            int cubo = i * i * i;
            System.out.printf("%-7d| %-9d| %-5d%n", i, quadrado, cubo);
        }
    }
}
