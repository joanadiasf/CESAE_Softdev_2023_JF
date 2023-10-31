package FichaPratica04;

import java.util.Scanner;
public class Ex_04 {

    public static void main(String[] args) {

        //Scanner

        Scanner input = new Scanner(System.in);

        //Declarar + ler variaveis
        int valor,resultado;

        System.out.println("Insira um número para verificar se é um número primo: \n");
        valor = input.nextInt();

        resultado = valor % 2;


        if (resultado != 0){

            resultado = valor / 3;

            if (resultado != 1){

                System.out.println("Não é primo!");
            }

            System.out.println("É primo!!!");

        }

        else {

            System.out.println("Não é primo!");
        }

    }
}
