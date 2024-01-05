package Ex_01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();

        int num1 = 0, num2 = 0;
        String operacao;

        do {

            boolean okay = false;

            do {
                try {
                    System.out.print("Insira um número: ");
                    num1 = input.nextInt();
                    okay = true;
                } catch (InputMismatchException exc) {
                    System.out.println("NÚMERO INTEIRO!");
                    input.nextInt(); //limpar buffer
                }
            } while (!okay);

            System.out.print("Insira uma operação ( + - * / ): ");
            operacao = input.next();

            okay=false; //dar reset à variável
            do {
                try {
                    System.out.print("Insira um número: ");
                    num2 = input.nextInt();
                    okay = true;
                } catch (InputMismatchException exc) {
                    System.out.println("NÚMERO INTEIRO!");
                    input.nextInt(); //limpar buffer
                }
            } while (!okay);


            switch (operacao) {
                case "+":
                    System.out.println("Soma: " + calculator.add(num1, num2));
                    break;

                case "-":
                    System.out.println("Subtração: " + calculator.subtract(num1, num2));
                    break;

                case "*":
                    System.out.println("Multiplicação: " + calculator.multiply(num1, num2));
                    break;

                case "/":
                    try {
                        System.out.println("Divisão: " + calculator.divide(num1, num2));

                    } catch (IllegalArgumentException exc) {
                        System.out.println("Impossível dividir por 0");
                    }
                    break;
            }
        } while (true);
    }
}
