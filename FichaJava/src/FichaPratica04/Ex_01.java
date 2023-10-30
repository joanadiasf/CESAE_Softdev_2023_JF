package FichaPratica04;

import java.util.Scanner;
public class Ex_01 {

    public static void main(String[] args) {

        //Scanner

        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int valor1,valor2;
        double resultado;
        String opcao;

        //ler variaveis
        System.out.println("Insira o primeiro valor: ");
        valor1 = input.nextInt();

        System.out.println("Insira o segundo valor: ");
        valor2 = input.nextInt();

        //Loop + menu

        System.out.println("Escolha uma operação usando + | - | * | / ");
        opcao = input.next();

        do {
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
                    resultado = (double) valor1 / valor2;
                    System.out.println(resultado);
                    break;
                    
                default:
                    System.out.println(" * | ERRO | *");
            }

        }while (!opcao.equals("s/n"));
            System.out.println("Menu:");
        };


    }


// FUNCIONA MAS O LOOP NÃO PARA