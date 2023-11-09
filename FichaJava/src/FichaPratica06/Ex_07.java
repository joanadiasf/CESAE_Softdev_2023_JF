package FichaPratica06;

import java.util.Scanner;

public class Ex_07 {

    public static void quadrado(String caracter, int  linhas, int coluna){



        //ler a altura do quadrado
        for(int l=0; l<linhas; l++) {

            //ler o comprimento do quadrado
            for (int c=0; c<coluna; c++) {

                //se a altura ou comprimento for 0 e a ultima coluna da linha até à penultima for o nr dado -1
                //ele vai imprimir o caracter, fora isso imprime o espaçamento
                if ( l==0 || c==0 ||l == linhas-1 || c == coluna-1){

                    System.out.print(caracter);

                } else {

                    System.out.print(" ");
                }

                //espaço entre caracteres
                System.out.print(" ");
            }

            //para ir para a próxima linha no fim da coluna
            System.out.print("\n");

        }



    }

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //Variaveis
        int linhas,coluna;
        String caracter;


        //Input
        System.out.println("Insira o caracter:");
        caracter = input.next();

        System.out.println("Insira um numero de linhas:");
        linhas = input.nextInt();

        System.out.println("Insira um numero de colunas");
        coluna = input.nextInt();

        //espaçamento
        System.out.println();
        quadrado(caracter,linhas,coluna);
    }

}
