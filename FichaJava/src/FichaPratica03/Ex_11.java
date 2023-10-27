package FichaPratica03;

import java.util.Scanner;
public class Ex_11 {

    public static void main(String[] args) {

        // Instanciar o Scanner obligatorio para todos os exercicios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num,conta;

        //Ler variável
        conta=0;

        System.out.println("Introduzir um número: ");
        num = input.nextInt();


            while (num > 0 && num < 100){

                System.out.println("Introduzir um número: ");
                num = input.nextInt();
                conta++;

                if (num > 0 && num < 25){
                    conta++;
                    System.out.println("[00,25]: "+conta);
                }

                if (num > 26 && num < 50){
                    conta++;
                    System.out.println("[26,50]: "+conta);
                }

                if (num > 51 && num < 75){
                    conta++;
                    System.out.println("[51,75]: "+conta);
                }

                if (num > 76 && num < 100){
                    conta++;
                    System.out.println("[76,100]: "+conta);
                }

            }

    }
}
