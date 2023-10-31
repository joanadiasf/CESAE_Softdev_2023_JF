package FichaPratica04;

import java.util.Scanner;
public class Ex_04 {

    public static void main(String[] args) {

        //Scanner

        Scanner input = new Scanner(System.in);

        //Declarar + ler variaveis
        int valor,stop,resultado;
        stop=0;





        while (stop == 0){

            System.out.println("Insira um número para ver se este é primo: \n");
            valor = input.nextInt();


            resultado= valor % 2;

            if (resultado == 0){

                resultado= valor % 3 ;

                if (resultado != 0){
                    System.out.println("O número inserido NÃO É PRIMO...");
                }
                    stop++;
            }

            if ( resultado != 0){
                System.out.println("O número é primo!!!");

            }



        }



    }
}
