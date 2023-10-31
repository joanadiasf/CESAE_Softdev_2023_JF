package FichaPratica04;

import java.util.Scanner;
public class Ex_01 {

    public static void main(String[] args) {

        //Scanner

        Scanner input = new Scanner(System.in);

        //declarar variaveis

        double resultado,valor1,valor2;
        String opcao,repeat;

        //Ler variáveis + Loop

        do {

            System.out.println("Insira o primeiro valor: ");
            valor1 = input.nextDouble();

            System.out.println("Insira o segundo valor: ");
            valor2 = input.nextDouble();

            System.out.println("Escolha uma operação aritmética usando + | - | * | / ");
            opcao = input.next();

            switch (opcao){

                case "+":
                    resultado = valor1 + valor2;
                    System.out.println(resultado);

                    break;

                case "-":
                    resultado = valor1 - valor2;
                    System.out.println(resultado);

                    break;

                case "*":
                    resultado = valor1 * valor2;
                    System.out.println(resultado);

                    break;

                case "/":
                    resultado = valor1 / valor2;
                    System.out.println(resultado);

                    break;
                    
                default:
                    System.out.println(" * | ERRO | *");

            }

            do {
                System.out.println("Deseja continuar? (introduza s/n)");
                repeat = input.next();
            }while (!repeat.equals("s") && !repeat.equals("n") );




        }while (!repeat.equals("n"));


        }


    }


