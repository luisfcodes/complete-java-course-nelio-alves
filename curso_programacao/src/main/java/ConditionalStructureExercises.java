import java.util.Scanner;

public class ConditionalStructureExercises {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise7();
        exercise8();
    }

    private static void exercise1() {
        //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

        System.out.print("Digite o número: ");
        int x = sc.nextInt();

        if(x < 0){
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NAO NEGATIVO");
        }
    }

    private static void exercise2() {
        //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

        System.out.print("Digite o número: ");
        int x = sc.nextInt();

        if(x % 2 == 0){
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
    }

    private static void exercise3() {
        //Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
        //Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
        //ordem crescente ou decrescente.

        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        if(a % 2 == 0 && b % 2 == 0){
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }

    private static void exercise4() {
        //Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        //começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

        System.out.print("Digite o horário inicial do jogo: ");
        int x = sc.nextInt();

        System.out.print("Digite o horário final do jogo: ");
        int y = sc.nextInt();

        int gameDuration = y - x;

        if(gameDuration <= 0){
            gameDuration += 24;
        }

        System.out.printf("O JOGO DUROU %d HORAS", gameDuration);
    }

    private static void exercise5() {
        //Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
        //seguir, calcule e mostre o valor da conta a pagar.
        // CODIGO | ESPECIFICACAO   | PRECO
        // 1      | Cachorro Quente | R$ 4.00
        // 2      | X-Salada        | R$ 4.50
        // 3      | X-Bacon         | R$ 5.00
        // 4      | Torrada Simples | R$ 2.00
        // 5      | Refrigerante    | R$ 1.50

        double itemOne = 4.00;
        double itemTwo = 4.50;
        double itemThree = 5.00;
        double itemFour = 2.00;
        double itemFive = 1.50;

        System.out.print("Informe o código do item: ");
        int code = sc.nextInt();

        System.out.print("Informe a quantidade consumida: ");
        int quantity = sc.nextInt();

        if(code == 1) {
            double calc = itemOne * quantity;
            System.out.printf("Total: R$ %.2f", calc);
        } else if (code == 2) {
            double calc = itemTwo * quantity;
            System.out.printf("Total: R$ %.2f", calc);
        } else if (code == 3) {
            double calc = itemThree * quantity;
            System.out.printf("Total: R$ %.2f", calc);
        } else if (code == 4) {
            double calc = itemFour * quantity;
            System.out.printf("Total: R$ %.2f", calc);
        } else {
            double calc = itemFive * quantity;
            System.out.printf("Total: R$ %.2f", calc);
        }
    }

    private static void exercise6() {
        //Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
        //seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
        //nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

        System.out.print("Digite o número desejado: ");
        double number = sc.nextDouble();

        if(number >= 0 && number <= 25) {
            System.out.printf("O número %.2f está no intervalo de 0 a 25", number);
        } else if (number > 25 && number <= 50) {
            System.out.printf("O número %.2f está no intervalo de 25 a 50", number);
        } else if (number > 50 && number <= 75) {
            System.out.printf("O número %.2f está no intervalo de 50 a 75", number);
        } else if (number > 75 && number <= 100) {
            System.out.printf("O número %.2f está no intervalo de 75 a 100", number);
        } else {
            System.out.printf("O número %.2f está fora dos intervalos disponíveis", number);
        }
    }

    private static void exercise7() {
        //Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
        //de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
        //ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
        //Se o ponto estiver na origem, escreva a mensagem “Origem”.
        //Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
        //situação.
        //Q2 | Q1
        //---|---
        //Q3 | Q4

        System.out.print("Informe o valor de x: ");
        double x = sc.nextDouble();

        System.out.print("Informe o valor de y: ");
        double y = sc.nextDouble();

        if(x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else {
            System.out.println("Origem");
        }
    }

    private static void exercise8() {
        //Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
        //que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
        //qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
        //Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
        //mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

        //    ----------------------------------------------
        //   | Renda                     | Imposto de Renda |
        //   | de 0.00 a R$2000.00       |      Isento      |
        //   | de R$2000.01 a R$3000.00  |        8%        |
        //   | de R$3000.01 a R$4500.00  |        18%       |
        //   | acima de R$4500.00        |        28%       |
        //    ----------------------------------------------

        //Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
        //salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
        //de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
        //duas casas decimais.

        double taxOne = 0.08;
        double taxTwo = 0.18;
        double taxThree = 0.28;

        System.out.print("Informe seu salário bruto: ");
        double salary = sc.nextDouble();

        double taxToPay = 0.0;

        if (salary <= 2000) {
            System.out.println("Isento");
        } else if (salary <= 3000) {
            taxToPay = (salary - 2000) * taxOne;
            System.out.printf("R$ %.2f%n", taxToPay);
        } else if (salary <= 4500) {
            taxToPay = (1000 * taxOne) + ((salary - 3000) * taxTwo);
            System.out.printf("R$ %.2f%n", taxToPay);
        } else {
            taxToPay = (1000 * taxOne) + (1500 * taxTwo) + ((salary - 4500) * taxThree);
            System.out.printf("R$ %.2f%n", taxToPay);
        }

        sc.close();
    }
}
