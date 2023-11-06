package FichaPratica05;

import java.util.Scanner;
public class Ex_10 {

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variavel de vetor - matriz
        int [][] matriz = new int [3][5];
        int linha, coluna,numverifica,apresenta=0;

        //matriz tem linhas e colunas

        for (linha =0; linha <=2; linha++){

            for (coluna=0; coluna <=4; coluna++){

                System.out.println("Insira um vetor: ");
                matriz[linha][coluna]=input.nextInt();
            }

        }

        //o utilizador vai verificar se nr está na matriz
        System.out.println("Qual o número a pesquisar? ");
        numverifica = input.nextInt();

        //verificar se está na matriz

        for (linha=0; linha <=2; linha++){

            for (coluna=0; coluna <=4; coluna++){

                if (numverifica == matriz[linha][coluna]){

                    apresenta++;
                }
            }
        }

        if (apresenta > 0){

            System.out.println("O número "+ numverifica + "aparece: " + apresenta + "x na matriz");
        }
        else {

            System.out.println("O seu número "+ numverifica + " não aparece na matriz...");
        }


    }
}
