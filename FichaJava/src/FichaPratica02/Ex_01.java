package FichaPratica02;

import java.util.Scanner;
public class Ex_01 {

    public static void main(String[] args) {

        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int valor1,valor2;

        //Ler valores
        System.out.println("Inserir valor: ");
        valor1 = input.nextInt();

        System.out.println("Inserir o outro valor: ");
        valor2 = input.nextInt();

        //Condicional

        if (valor1 > valor2){
            System.out.println("O valor maior é: " + valor1);
             }

        if (valor2>valor1){
            System.out.println("O valor maior é: " + valor2);
        }

        if (valor1==valor2){
            System.out.println("O valor é igual!");
        }

    }


}
