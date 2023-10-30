package FichaPratica04;

import java.util.Scanner;
public class Ex_01 {

    public static void main(String[] args) {

        //Scanner

        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int valor1,valor2;
        double resultado;
        String opcao,repeat;

        //ler variaveis
        System.out.println("Insira o primeiro valor: ");
        valor1 = input.nextInt();

        System.out.println("Insira o segundo valor: ");
        valor2 = input.nextInt();

        //Loop + menu

        repeat = "s/n";

        do {

            System.out.println("Escolha uma operação usando + | - | * | / ");
            opcao = input.next();

            switch (opcao){

                case "+":
                    resultado = valor1 + valor2;
                    System.out.println(resultado);
                    System.out.println("Deseja continuar? (introduza s/n)");
                    break;

                case "-":
                    resultado = valor1 - valor2;
                    System.out.println(resultado);
                    System.out.println("Deseja continuar? (introduza s/n)");
                    break;

                case "*":
                    resultado = valor1 * valor2;
                    System.out.println(resultado);
                    System.out.println("Deseja continuar? (introduza s/n)");
                    break;

                case "/":
                    resultado = (double) valor1 / valor2;
                    System.out.println(resultado);
                    System.out.println("Deseja continuar? (introduza s/n)");
                    break;
                    
                default:
                    System.out.println(" * | ERRO | *");
                    System.out.println("Deseja continuar? (introduza s/n)");
            }



        }while (!opcao.equals(repeat));
            System.out.println("Menu:");
        }


    }


//SE CARREGAR S/N DA ERRO EM VEZ DE VOLTAR AO INICIO