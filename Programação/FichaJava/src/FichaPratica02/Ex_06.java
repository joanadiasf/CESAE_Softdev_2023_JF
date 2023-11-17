package FichaPratica02;

import java.util.Scanner;
public class Ex_06 {

    public static void main(String[] args) {

        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        double num1,num2;

        //Ler variaveis
        System.out.println("Introduzir 1º número: ");
        num1= input.nextDouble();

        System.out.println("Introduzir 2º número: ");
        num2= input.nextDouble();

        //Condicionais
        if (num1<num2){
            System.out.println("\nMaior: " + num2 + "       Menor:" + num1);
        }

        if (num2<num1){
            System.out.println("\nMaior: " +num1 + "       Menor:" + num2);
        }

        if (num1==num2){
            System.out.println("\nOs números são iguais");
        }
    }
}
