package introduction;

import java.util.Scanner;

public class WhileStructureExercises {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();

        sc.close();
    }

    public static void exercise1(){
        //Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
        //incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
        //impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

        int correctPassword = 2002;

        System.out.print("Informe sua senha: ");
        int passwordUser = sc.nextInt();

        while (passwordUser != correctPassword){
            System.out.println("Senha inválida!!!!");
            System.out.print("Informe sua senha novamente: ");
            passwordUser = sc.nextInt();
        }

        System.out.println("Acesso permitido");
    }

    public static void exercise2() {
        //Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
        //cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
        //menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

        System.out.print("Informe o número da coordenada X: ");
        int xCoordinate = sc.nextInt();

        System.out.print("Informe o número da coordenada Y: ");
        int yCoordinate = sc.nextInt();

        while (xCoordinate != 0 && yCoordinate != 0) {
            if (xCoordinate > 0 && yCoordinate > 0) {
                System.out.println("O ponto (" + xCoordinate + "," + yCoordinate + ") está no primeiro quadrante.");
            } else if (xCoordinate < 0 && yCoordinate > 0) {
                System.out.println("O ponto (" + xCoordinate + "," + yCoordinate + ") está no segundo quadrante.");
            } else if (xCoordinate < 0 ) {
                System.out.println("O ponto (" + xCoordinate + "," + yCoordinate + ") está no terceiro quadrante.");
            } else {
                System.out.println("O ponto (" + xCoordinate + "," + yCoordinate + ") está no quarto quadrante.");
            }

            System.out.print("Informe o número da coordenada X: ");
            xCoordinate = sc.nextInt();

            System.out.print("Informe o número da coordenada Y: ");
            yCoordinate = sc.nextInt();
        }
    }

    public static void exercise3() {
        //Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
        //um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
        //4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
        //que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
        //mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
        //exemplo.

        final int alcoholCode = 1;
        final int gasolineCode = 2;
        final int dieselCode = 3;
        final int endCode = 4;

        int alcoholCounter = 0;
        int gasolineCounter = 0;
        int dieselCounter = 0;

        System.out.print("Informe o tipo de combustível abastecido: ");
        int typeOfFuel = sc.nextInt();

        while (typeOfFuel != endCode) {
            switch (typeOfFuel) {
                case alcoholCode:
                    alcoholCounter++;
                    break;
                case gasolineCode:
                    gasolineCounter++;
                    break;
                case dieselCode:
                    dieselCounter++;
                    break;
                default:
                    System.out.println("Código informado inválido!!!");
                    System.out.print("Informe o tipo de combustível abastecido: ");
            }
            if(typeOfFuel > 0 && typeOfFuel < 4) {
                System.out.println("Registro realizado com sucesso!!!");
                System.out.print("Informe outro tipo de combustível abastecido ou digite 4 para encerrar: ");
            }
            typeOfFuel = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO!!!");
        System.out.printf("Abastecimentos de Álcool: %d%n", alcoholCounter);
        System.out.printf("Abastecimentos de Gasolina: %d%n", gasolineCounter);
        System.out.printf("Abastecimentos de Diesel: %d%n", dieselCounter);
    }
}
