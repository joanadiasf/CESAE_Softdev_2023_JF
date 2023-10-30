package FichaPraticaExtraCiclos;

import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {

        //Declarar variáveis
        String simbolo,espaco;
        int conta,contesp;

        conta=1;

        //4.1
        simbolo = "**********";

        while (conta <=4){

            System.out.println(simbolo);
            conta++;

        }

        System.out.println("\n");

        //4.2
        simbolo = "*";


        for (conta=1;conta <=5;conta++){

            System.out.println(simbolo);

            simbolo += "*";

        }


        System.out.println("\n");

        //4.3

        simbolo = "*";
        espaco = ".";
        contesp = 1;

        for (conta=1;conta <=5;conta++){



            while (contesp <=5){

                System.out.println(espaco);
                espaco += ".";

                contesp++;


            }

            while (conta <=5){

                System.out.println(simbolo);

                simbolo += "*";
                conta++;
            }



        }

    }
}
