package FichaPraticaExtraArraysMatrizes;

import java.util.Scanner;
public class Ex_05 {

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variaveis e vetor
        int [] vetor = new int[12];
        int [] vetor2 = new int[12];
        int compara;

        //Input
        for (int l = 0; l < 12; l++){

            System.out.print("Insira número no Vetor [" + l + "]: ");
            vetor[l] = input.nextInt();

        }

        //encontrar valores duplicados

        compara = vetor[0];

        //verificar linha

        for ( int l = 0; l < 12; l++){



            if (compara == vetor[l]){

                vetor2[l] = vetor[l];

            }
            else {

                vetor2[l] = vetor[l]+3;
            }

            compara = vetor[l];
        }

        System.out.println();

        for (int l = 1; l < 12; l++){

            if (vetor2[l] == vetor[l]){

                System.out.println("Na posição " + l + ": o número repetido é o " + vetor2[l]);
            }



        }



    }
}

//acabar