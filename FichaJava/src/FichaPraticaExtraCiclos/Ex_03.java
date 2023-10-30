package FichaPraticaExtraCiclos;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        int num,resultado,multi;



        num=1;
        multi=1;


        for (multi=1;multi<=10;multi++){

            System.out.println("Tabuada do "+ multi + ": ");

            for (num=1;num<=10;num++){

                resultado = multi * num;

                System.out.println(multi + "x" + num + " = " + resultado);
            }
        }







//        System.out.println("Tabuada do " + multi + ": ");

//        while (num <= 10){
//
//            resultado = multi * num;
//
//            System.out.println(multi +"x"+ num + " =" + resultado);
//
//            num++;
//
//
//            if (num > 10){
//                multi++;
//
//                System.out.println("\nTabuada do " + multi + ": ");
//
//            }
//        }


    }
}


// for
//      for