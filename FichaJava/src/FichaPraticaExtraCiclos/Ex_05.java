package FichaPraticaExtraCiclos;

import java.util.Scanner;
public class Ex_05 {

    public static void main(String[] args) {

        //declarar variaveis
        int num,conta,simetria,coluna;
        String linha;

        //5.1
        
        num=1;
        conta=1;
        linha = "";

        for (conta=1;conta<=5;conta++){

            for (num=1;num<=conta;num++){

                linha += conta + " ";

                if (num == conta){

                    linha += "\n";
                }

            }

        }
        System.out.println(linha);


        System.out.println("\n");


        //5.2

        simetria=0;
        num =1;
        conta =1;
        linha = "";

    }
}
