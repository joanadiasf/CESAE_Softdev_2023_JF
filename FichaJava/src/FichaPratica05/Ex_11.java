package FichaPratica05;

import java.util.Scanner;
public class Ex_11 {

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variavel de vetor - matriz
        int [][] matriz = new int [3][3];
        int linha, coluna,nummaior=0,nummenor=0;
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

        //ver qual o numero maior

        nummaior = matriz[0][0];

        for (linha = 0; linha <= 2; linha++) {


            for (coluna = 0; coluna <= 2; coluna++) {

                if (nummaior < matriz[linha][coluna]){

                    nummaior = matriz[linha][coluna];

                }
            }
        }

        System.out.println("\n O número maior é: " + nummaior);

        //ver qual o numero menor

        nummenor = matriz[0][0];

        for (linha = 0; linha <= 2; linha++) {


            for (coluna = 0; coluna <= 2; coluna++) {

                if (nummenor > matriz[linha][coluna]){

                    nummenor = matriz[linha][coluna];

                }
            }
        }

        System.out.println("\n O número menor é: " + nummenor);

        //pra ler matriz e por nrs seguidos
        for (linha=0; linha <=2; linha++){

            for (coluna =0; coluna <=2; coluna++){

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
