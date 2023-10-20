package FichaPratica01;

import java.util.Scanner;
public class Ex_05 {

    public static void main(String[] args) {

        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        double valor1,valor2,valor3,mediaar,mediapon;

        //Ler valores
        System.out.println("Insira um valor");
        valor1 = input.nextInt();

        System.out.println("Insira um valor");
        valor2 = input.nextInt();

        System.out.println("Insira um valor");
        valor3 = input.nextInt();

        //Calcular e apresentar medias
        mediaar = (valor1 + valor2 + valor3) / 3;

        mediapon = (valor1 * 0.2) + (valor2 * 0.3) + (valor3 * 0.5);


        System.out.println("Média Aritmética é: " + mediaar);
        System.out.println("Média Ponderada é: " + mediapon);

    }
}
