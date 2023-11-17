package FichaPratica05;

import java.util.Scanner;

class Ex_08 {

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variavel de vetor - matriz
        int [][] matriz = new int [3][3];
        int linha, coluna;
        String strg;

        //string para ele imprimir mais que um nr seguido
        strg= "";

        //matriz tem linhas e colunas

        for (linha = 0; linha <= 2; linha++) {


            for (coluna = 0; coluna <= 2; coluna++) {

                System.out.println("Insira um vetor: ");
                matriz[linha][coluna]=input.nextInt();
            }
        }


        //pra ler matriz e por nrs seguidos
        for (linha=0; linha <=2; linha++){

            for (coluna =0; coluna <=2; coluna++){

                strg += matriz[linha][coluna] + "\t";


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
