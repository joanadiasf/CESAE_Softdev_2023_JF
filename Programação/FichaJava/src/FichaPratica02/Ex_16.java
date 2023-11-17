package FichaPratica02;

import java.util.Scanner;

public class Ex_16 {

    public static void main(String[] args) {

        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int dinheiro,notas,resto;

        //Ler variaveis
        System.out.println("Insira um valor (que seja múltiplo de 5) para saber as notas necessárias: \n");
        dinheiro = input.nextInt();

        //Condicionais
        if (dinheiro % 5 != 0){
            System.out.println("Não é múltiplo de 5");
        }

        else {
            notas = dinheiro / 200;
            System.out.println(notas + "notas de 200€");
            resto = dinheiro % 200;

            notas = dinheiro / 100;
            System.out.println(notas + "notas de 100€");
            resto = dinheiro % 100;

            notas = dinheiro / 50;
            System.out.println(notas + "notas de 50€");
            resto = dinheiro % 50;

            notas = dinheiro / 20;
            System.out.println(notas + "notas de 20€");
            resto = dinheiro % 20;

            notas = dinheiro / 10;
            System.out.println(notas + "notas de 10€");
            resto = dinheiro % 10;

            notas = dinheiro / 5;
            System.out.println(notas + "notas de 5€");
        }


    }
}
