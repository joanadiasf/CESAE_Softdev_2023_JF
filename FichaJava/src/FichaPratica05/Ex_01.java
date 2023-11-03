package FichaPratica05;

import java.util.Scanner;
public class Ex_01 {

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variavel de vetor
        int []vetor=new int[10];

        //Ler vetor (como sabemos qts x vai ser lido, usamos um ciclo for
        for ( int indice=0; indice < 10; indice++){

            System.out.println("Insira um número no Vetor: ");
            vetor[indice]= input.nextInt();

        }

        //imprimir vetores

        for ( int indice=0; indice < 10; indice++){

            System.out.println(vetor[indice]);

        }

    }
}
