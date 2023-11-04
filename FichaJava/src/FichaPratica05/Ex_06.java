package FichaPratica05;

import java.util.Scanner;
public class Ex_06 {

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variavel de vetor
        int []vetor=new int[10];


        //Dar valores ao vetor
        for ( int indice=0; indice < 10; indice++) {

            System.out.println("Insira um número no Vetor: ");
            vetor[indice] = input.nextInt();

        }

        //acrescentar boolean para determinar se a condição é verdadeira ou falsa
        boolean crescente=true;

        for ( int indice=1; indice < 10; indice++){

            if (vetor[indice] < vetor[indice -1]){

                crescente=false;
                break;
                //break pq senao o loop nao vai parar

            }

        }

        if (crescente){

            System.out.println("É crescente!");
        }else {
            System.out.println("Não é crescente...");
        }



    }
}
