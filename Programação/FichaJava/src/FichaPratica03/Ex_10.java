package FichaPratica03;

import java.util.Scanner;
public class Ex_10 {

    public static void main(String[] args) {

        // Instanciar o Scanner obligatorio para todos os exercicios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int limite, soma,salto;

        //Ler variáveis
        System.out.println("Introduza um limite: ");
        limite = input.nextInt();

        System.out.println("Introduza um salto: ");
        salto = input.nextInt();
        soma=salto;

        System.out.println("0");
        System.out.println(salto);

        while (limite > soma){
            System.out.println(soma);
            soma= salto+soma;


        }
    }
}
