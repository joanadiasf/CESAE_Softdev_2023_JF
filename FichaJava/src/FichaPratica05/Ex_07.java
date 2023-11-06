package FichaPratica05;

import java.util.Scanner;
public class Ex_07 {

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

        //nummaior -1 pq é preciso considerar se algum dos nrs vai ser 0

        nummaior = -1;

        //ciclo para verificar todas as "gavetas"
        for ( int indice=0; indice < 10; indice++){


                    //condição para só gravar o nr se for par
                if ( ( nummaior < vetor[indice] || nummaior==-1) && vetor[indice]%2==0){

                    nummaior = vetor[indice];


                }


        }


        //apresentar valores
        if (nummaior != -1){
            System.out.println("O maior número par é: " + nummaior);
        }

        if (nummaior==-1){

            System.out.println("Não há números pares na sequência...");
        }

    }
}

