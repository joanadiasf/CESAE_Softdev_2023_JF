package FichaPratica05;

import java.util.Scanner;
public class Ex_03 {

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variavel de vetor
        int []vetor=new int[10];
        int nummaior;

        for ( int indice=0; indice < 10; indice++){

            System.out.println("Insira um número no Vetor: ");
            vetor[indice]= input.nextInt();

        }

        nummaior = vetor[0];

        for ( int indice=1; indice < 10; indice++){

            if (nummaior < vetor[indice]){

                nummaior = vetor[indice];

            }

        }

        System.out.println("O maior é: " + nummaior);
    }
}
