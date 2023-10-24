package FichaPratica02;

import java.util.Scanner;

public class Ex_16 {

    public static void main(String[] args) {

        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int dinheiro;

        //Ler variaveis
        System.out.println("Insira um valor (que seja múltiplo de 5) para saber as notas necessárias: \n");
        dinheiro = input.nextInt();

        //Condicionais
        if (dinheiro / 5 == 1){
            System.out.println("1 nota de 5€");
        }

        if (dinheiro / 5 == 2){
            System.out.println("1 nota de 10€");
        }

        if (dinheiro / 5 == 3){
            System.out.println("1 nota de 5€ e 1 nota de 10€");
        }

        if ( dinheiro / 5 == 4){
            System.out.println("1 nota de 20€");
        }

        if (dinheiro / 5 == 5){
            System.out.println("1 nota de 5€ e 1 nota de 20€");
        }

        if ( dinheiro / 5 == 6){
            System.out.println("1 nota de 20€ e 1 nota de 10€");
        }

        if ( dinheiro / 5 == 7){
            System.out.println("1 nota de 20€, 1 nota de 10€ e 1 nota de 5€");
        }

        if ( dinheiro / 5 == 8){
            System.out.println("2 nota de 20€");
        }

    }
}
