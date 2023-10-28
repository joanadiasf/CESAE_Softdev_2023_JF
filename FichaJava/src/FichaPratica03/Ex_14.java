package FichaPratica03;

import java.util.Scanner;
public class Ex_14 {

    public static void main(String[] args) {

        // Instanciar o Scanner obligatorio para todos os exercicios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int n,aux,total;

        //Ler variáveis
        System.out.println("Insira um número inteiro não-negativo: ");
        n = input.nextInt();

        total= n;
        aux=n;
        //cont soma ate valor
        //fatorial valor dado x cont
        //5x4x3x2x1=120


        //Loop
        while ( aux > 0 ){

            aux = n-1;
            if (n >= aux){

                total=total*aux;

            }


        }
        System.out.println(total);
    }
}
