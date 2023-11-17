package FichaPratica04;

import java.util.Scanner;
public class Ex_01 {

    public static void main(String[] args) {

        //Scanner

        Scanner input = new Scanner(System.in);

        //declarar variaveis
        //double + string (double - ler valores não inteiros | string - ler caracteres


        double resultado,valor1,valor2;
        String opcao,repeat;

        //Ler variáveis + Loop
        //ciclo do...while porque tem que rodar pelo menos 1vez


        do {

            System.out.println("Insira o primeiro valor: ");
            valor1 = input.nextDouble();

            System.out.println("Insira o segundo valor: ");
            valor2 = input.nextDouble();

            System.out.println("Escolha uma operação aritmética usando + | - | * | / ");
            opcao = input.next();


            //switch case para "menu"

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


            //outro ciclo do...while para garantir que o utilizador escreve um s ou um n
            //ou seja "while" repeat != de s e != de n, "do" o ciclo

            do {
                System.out.println("Deseja continuar? (introduza s/n)");
                repeat = input.next();
            }while (!repeat.equals("s") && !repeat.equals("n") );


            //assim que o utilizador escrever n o ciclo "grande" para, se ele escrever s ele continua
            //ou seja "while" repeat for != de n , "do" ciclo

        }while (!repeat.equals("n"));


        }


    }


