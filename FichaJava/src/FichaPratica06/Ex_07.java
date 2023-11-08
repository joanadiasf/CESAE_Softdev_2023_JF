package FichaPratica06;

import java.util.Scanner;

public class Ex_07 {

    public static void quadrado(String caracter, int  linhas, int coluna){

    String strg="";


        for (int l=1; l <= linhas;l++){

            for (int c=0; c <= coluna; c++ ){

                strg += caracter;

                if (c==l){
                    strg += "\n";
                }
                if (c==coluna+1 && c==coluna-1){

                    strg += " ";
                }
            }

        }
        System.out.println(strg);


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

        quadrado(caracter,linhas,coluna);
    }

}
