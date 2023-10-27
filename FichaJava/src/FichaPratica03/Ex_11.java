package FichaPratica03;

import java.util.Scanner;
public class Ex_11 {

    public static void main(String[] args) {

        // Instanciar o Scanner obligatorio para todos os exercicios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num,conta1,conta2,conta3,conta4;

        //Ler variável
        conta1=0;
        conta2=0;
        conta3=0;
        conta4=0;

        System.out.println("Introduzir um número: ");
        num = input.nextInt();


            while (num >= 0 && num <= 100){



                if (num <= 25){
                    conta1++;

                }

                else if (num > 26 && num <= 50){
                    conta2++;

                }

                else if (num > 51 && num <= 75){
                    conta3++;

                }

                else if (num > 76 && num <= 100){
                    conta4++;

                }
                else
                    break;

                System.out.println("Introduzir um número: ");
                num = input.nextInt();
            }

        System.out.println("[00,25]: "+conta1);
        System.out.println("[26,50]: "+conta2);
        System.out.println("[51,75]: "+conta3);
        System.out.println("[76,100]: "+conta4);

    }
}
