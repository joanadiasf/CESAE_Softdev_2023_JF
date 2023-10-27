package FichaPratica03;

import java.util.Scanner;
public class Ex_13 {

    public static void main(String[] args) {

        // Instanciar o Scanner obligatorio para todos os exercicios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int nmax,num,conta,aux,check;

        //Ler variáveis

        conta = 0;
        aux = 0;
        check = 0;

        System.out.println("Quantos números deseja inserir? ");
        nmax = input.nextInt();


        //Loop
        while (conta < nmax){

            System.out.println("Introduza um número: ");
            num = input.nextInt();

                if (num < aux){
                    check++;
                }

                aux=num;
                conta++;
        }

        if (check >0){
            System.out.println("Não é crescente!");
        }
        else {
            System.out.println("Crescente!");
        }
    }
}
