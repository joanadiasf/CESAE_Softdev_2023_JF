package FichaPratica06;

import java.util.Scanner;

public class Ex_08 {

    public static void somarMatrizes (int [][]matriz1, int [][]matriz2){

        Scanner input = new Scanner(System.in);




        //matriz1
        for (int l=0; l < matriz1.length; l++){

            for (int c=0; c < matriz1[0].length; c++){

                System.out.println("Insira os elementos");
                matriz1[l][c] = input.nextInt();

            }
        }

        //matriz2
        for (int l=0; l < matriz2.length; l++){

            for (int c=0; c < matriz2[0].length; c++){

                System.out.println("Insira os elementos");
                matriz2[l][c] = input.nextInt();

            }
        }

        //matrizsoma
//        int [][]matrizsoma = new int[][];



    }
}
