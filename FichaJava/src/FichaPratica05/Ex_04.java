package FichaPratica05;

import java.util.Scanner;
public class Ex_04 {

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variavel de vetor
        int []vetor=new int[10];
        int nummenor;

        for ( int indice=0; indice < 10; indice++){

            System.out.println("Insira um número no Vetor: ");
            vetor[indice]= input.nextInt();

        }

        nummenor = vetor[0];

        for ( int indice=1; indice < 10; indice++){

            if (nummenor > vetor[indice]){

                nummenor = vetor[indice];

            }

        }

        System.out.println("O menor é: " + nummenor);
    }
}
