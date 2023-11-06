package FichaPratica05;

import java.util.Scanner;
public class Ex_12 {

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variavel de vetor
        int []vetor1=new int[10];
        int []vetor2=new int[10];
        int [][]matriz =new int[10][2];
        int linha=0,coluna=0,indice1,indice2;

        String strg;

        //string para ele imprimir mais que um nr seguido
        strg= "";

        System.out.println("Vetor 1");

        for ( indice1=0; indice1 <= 9; indice1++){

            System.out.println("Insira um número no Vetor: ");
            vetor1[indice1]= input.nextInt();


        }

        for ( indice1=0; indice1 <= 9; indice1++){

            matriz[linha][0]=vetor1[indice1];
        }

        System.out.println(" \nVetor 2");

        for (indice2=0; indice2 <= 9; indice2++){

            System.out.println("Insira um número no Vetor: ");
            vetor2[indice2]= input.nextInt();


        }

        for (indice2=0; indice2 <= 9; indice2++){


            matriz[linha][coluna] = vetor2[indice2];
        }


        //pra ler matriz e por nrs seguidos
        for (linha=0; linha <=9; linha++){

            for (coluna =0; coluna <=1; coluna++){

                strg += matriz[linha][coluna] + " ";


                if (coluna == 2){

                    strg += "\n";
                }

            }
        }

        //imprimir FORA do for para so aparecer o que se quer
        System.out.println("\n");
        System.out.println(strg);




    }
}
