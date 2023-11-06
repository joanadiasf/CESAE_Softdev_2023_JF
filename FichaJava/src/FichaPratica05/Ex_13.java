package FichaPratica05;

import java.util.Scanner;
public class Ex_13 {

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variavel  matriz
        int [][] matriz = new int[4][4];
        int soma=0;

        //matriz "declarar"
        for (int l=0; l < 4 ; l++){

            for ( int c=0; c < 4; c++){

                System.out.println("Insira os números para a matriz: ");
                matriz[l][c] = input.nextInt();

            }
        }

        //somar diagonal principal 0,0 + 1,1 + 2,2 + 3,3
        //vai verificar linha a linha e coluna a coluna

        for (int l=0; l < 4; l++){

            for (int c=0; c < 4; c++){

                //só vai fazer a soma se o nr da liha for igual ao nr da coluna (0,0 + 1,1 + 2,2 + 3,3)
                if (l==c){

                    soma = soma + matriz[l][c];
                }
            }
        }

        //imprimir resultado : soma
        System.out.println("A soma da diagonal principal é: " + soma);

    }
}
