package FichaPraticaExtraCiclos;

import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {

        //Declarar variáveis
        String simbolo;
        int conta, simetria,coluna;

        conta = 1;

        //4.1
        simbolo = "**********";

        while (conta <= 4) {

            System.out.println(simbolo);
            conta++;

        }

        System.out.println("\n");

        //4.2
        simbolo = "*";


        for (conta = 1; conta <= 5; conta++) {

            System.out.println(simbolo);

            simbolo += "*";

        }


        System.out.println("\n");

        //4.3

        simbolo = "";
        simetria = 0;
        conta = 1;


        //linhas
        for (conta = 1; conta <= 5; conta++){

            //colunas
            for (coluna=1; coluna <=9; coluna++){

                simbolo +=" ";

                if (coluna+simetria==5){

                    for (coluna=5-simetria; coluna<=5+simetria;coluna++){

                        simbolo += "*";
                    }
                }

            }

            //muda de linha
            simbolo += "\n";
            simetria++;

        }

        System.out.println(simbolo);

                //1for - numero de linhas
                // 2for - por espaços na coluna
                // if - simetria para achar o meio da piramide
                //mudar de linha e simetria++ para acrescentar * apartir do meio
    }
}
