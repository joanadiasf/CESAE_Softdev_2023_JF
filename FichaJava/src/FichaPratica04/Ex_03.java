package FichaPratica04;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {

        //Scanner

        Scanner input = new Scanner(System.in);

        //Declarar + ler variáveis
        int tentativa, contador=1;

        System.out.println("Adivinhe o número! (De 0 a 100): \n");
        tentativa = input.nextInt();

        System.out.println("\n");

        while (tentativa >= 0 && tentativa <= 100 && tentativa !=70){

            if (tentativa > 0 && tentativa <= 69) {

                System.out.println("Baixo");
            }
            if (tentativa >= 71 && tentativa < 100) {

                System.out.println("Alto");



            }
        tentativa = input.nextInt();
        contador++;
        }

        if (tentativa==70){

            System.out.println("ACERTOU!!");
            System.out.println("Número de tentativas: " + contador);
        }
    }

}

