package FichaPraticaExtraFuncoes;

import java.util.Scanner;

public class Ex_01 {

    public static void numeroMaisPequeno(){

        //Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int num1,num2,num3,numP=0;

        //Input utilizador
        System.out.println("Insira o primeiro número: ");
        num1 = input.nextInt();

        System.out.println("Insira o segundo número: ");
        num2 = input.nextInt();

        System.out.println("Insira o terceiro número: ");
        num3 = input.nextInt();

        //Comparar números

        if (num1 < num2){

            if (num1 < num3){

                numP=num1;
            }
        }

        if (num2 < num1){

            if (num2 < num3){

                numP=num2;
            }
        }

        if (num3 < num2){

            if (num3 < num1){

                numP=num3;
            }
        }

        //Imprimir número mais pequeno

        System.out.println();
        System.out.println("O número mais pequeno é: " + numP);
    }


    public static void main(String[] args) {

        //espaçamento

        System.out.println();


        System.out.println("*************** Qual o número mais pequeno dos três? ***************");

        System.out.println();

        numeroMaisPequeno();

    }
}
