package FichaPraticaExtraCiclos;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        //Declarar variáveis
        int num, resultado, multi;


        num = 1;
        multi = 1;

        //for1 ( adiciona +1 ao multiplicador sempre que o for2 acabar)
        //for2 ( adiciona +1 ao numero sempre que repetir o ciclo)

        for (multi = 1; multi <= 10; multi++) {

            System.out.println("\nTabuada do " + multi + ": ");

            for (num = 1; num <= 10; num++) {

                resultado = multi * num;

                System.out.println(multi + "x" + num + " = " + resultado);
            }
        }


    }
}