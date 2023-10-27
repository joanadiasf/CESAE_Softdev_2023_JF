package FichaPratica03;

import java.util.Scanner;
public class Ex_12 {

    public static void main(String[] args) {
        // Instanciar o Scanner obligatorio para todos os exercicios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int inicio,fim;

        //Ler variáveis
        System.out.println("Introduza valor de início: ");
        inicio = input.nextInt();

        System.out.println("Introduza valor de fim: ");
        fim = input.nextInt();
        System.out.println("\n");

        //Loop



            while (inicio <= fim){

                if (inicio % 5 ==0){

                System.out.println(inicio);

                }

                inicio++;
            }










    }
}
