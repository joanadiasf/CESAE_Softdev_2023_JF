package FichaPratica03;

import java.util.Scanner;
public class Ex_09 {

    public static void main(String[] args) {

        // Instanciar o Scanner obligatorio para todos os exercicios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num,dois;

        //Ler variáveis
        dois = 2;

        System.out.println("Insira um número inteiro: ");
        num = input.nextInt();


        while (num >= dois){
            System.out.println(dois);

            dois= dois +2;
        }


    }
}
