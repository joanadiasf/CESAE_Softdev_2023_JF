package FichaPratica02;

import java.util.Scanner;
public class Ex_07 {

    public static void main(String[] args) {

        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        double num;

        //Ler variavel
        System.out.println("Introduza um número: ");
        num= input.nextDouble();

        //Condicionais
        if (num%2==0)
            System.out.println("O número é par!");

        else
            System.out.println("O número é impar!");


    }
}
