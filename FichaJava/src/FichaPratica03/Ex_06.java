package FichaPratica03;

import java.util.Scanner;
public class Ex_06 {

    public static void main(String[] args) {

        //Declarar variaveis
        int num,soma;


        num=1;
        soma=num;

        //Loop
        System.out.println("\n");

        while (num <=100){
            System.out.println(num);
            num=num+1;

            soma=soma + num;
            System.out.println("Somatório: " + soma);
        }

        System.out.println("Somatório: " + soma);



    }
}
