package FichaPratica05;

import java.util.Scanner;
public class Ex_05 {

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variavel de vetor
        int []vetor=new int[10];
        double media=0;

        for ( int indice=0; indice < 10; indice++){

            System.out.println("Insira um número no Vetor: ");
            vetor[indice]= input.nextInt();

            media= media + vetor[indice];

        }

        media = media / 10;

        System.out.println("A média é: " + media);
    }
}
