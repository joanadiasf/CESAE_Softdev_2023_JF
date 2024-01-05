package Ex_06;

import java.util.Scanner;

import static Ex_06.Calculadora.*;


public class Main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        double num1, num2;
        String opcao;

        System.out.print("1º Número: ");
        num1 = input.nextDouble();
        System.out.print("\n2º Número: ");
        num2 = input.nextDouble();

        System.out.print("\nEscolha a operação + | - | * | / \n");
        opcao = input.next();




            switch (opcao){

                case "+":
                    System.out.println(adicao(num1,num2));
                    break;

                case "-":
                    System.out.println(subtracao(num1,num2));
                    break;

                case "*":
                    System.out.println(multiplicacao(num1,num2));
                    break;

                case "/":
                    System.out.println(divisao(num1,num2));
                    break;


                default:
                    System.out.println("Operação inválida...");

            }



    }
}
