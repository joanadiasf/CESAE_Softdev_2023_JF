package FichaPratica03;

import java.util.Scanner;
public class Ex_8 {

    public static void main(String[] args) {

        // Instanciar o Scanner obligatorio para todos os exercicios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num,absoluto,media,conta;

        //Ler variáveis + Loop

        absoluto = -1;
        System.out.println("Insira um número: ");
        num = input.nextInt();

        media = num;
        conta = 1;

        while (num!=absoluto){
            System.out.println("Insira um número: " );
            num = input.nextInt();

            if (num != absoluto){
                media = media + num;
                conta++;
            }


        }

        media= media / conta;
        System.out.println("Média: " + media);


    }
}
