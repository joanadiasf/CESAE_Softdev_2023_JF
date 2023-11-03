package FichaPratica05;

import java.util.Scanner;
public class Ex_06 {

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variavel de vetor
        int []vetor=new int[10];
        int aux,check=0;


        for ( int indice=0; indice < 10; indice++) {

            System.out.println("Insira um número no Vetor: ");
            vetor[indice] = input.nextInt();


        }

        aux = vetor[0];

        for ( int indice=1; indice < 10; indice++){

            if (aux > vetor[indice]){

                if (vetor[indice] <= aux) {
                    check++;
                }


            }

        }
        if (check >0){
            System.out.println("Não é crescente!");
        }
        else {
            System.out.println("Crescente!");
        }



    }
}
