package FichaPratica05;

import java.util.Scanner;
public class Ex_09 {

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variavel de vetor - matriz
        int [][] matriz = new int [5][5];
        int linha, coluna,soma=0;


        //matriz tem linhas e colunas

        for (linha = 0; linha <= 4; linha++) {


            for (coluna = 0; coluna <= 4; coluna++) {

                System.out.println("Insira um vetor: ");
                matriz[linha][coluna]=input.nextInt();


                soma= soma + matriz[linha][coluna];
            }
        }

        System.out.println("A soma de todos os vetores é: " + soma);
    }
}
