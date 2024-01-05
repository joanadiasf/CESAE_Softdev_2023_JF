package FichaPratica03;

import java.util.Scanner;
public class Ex_05 {
    public static void main(String[] args) {

        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int inicio,fim;

        //Ler variáveis
        System.out.println("Número de início: ");
        inicio = input.nextInt();

        System.out.println("Número de fim: ");
        fim = input.nextInt();

        System.out.println("\n");

        //Loop
        while (inicio <= fim){
            System.out.println(inicio);
            inicio= inicio + 1;
        }


    }
}
