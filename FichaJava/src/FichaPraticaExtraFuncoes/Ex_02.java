package FichaPraticaExtraFuncoes;

import java.util.Scanner;

public class Ex_02 {

    public static double mediaAritmetica(double num1, double num2, double num3){




        double media;

        media= (num1 + num2 + num3)/3;

        return media;
    }

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        double num1,num2,num3;

        //Input
        System.out.println("Insira 3 números para fazer a média aritmética:");

        System.out.print("Insira o primeiro número:");
        num1 = input.nextInt();

        System.out.print("Insira o segundo número:");
        num2 = input.nextInt();

        System.out.print("Insira o terceiro número:");
        num3 = input.nextInt();

        
        System.out.println("A média aritmética é: " + mediaAritmetica(num1,num2,num3));
    }

}
