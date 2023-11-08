package FichaPratica06;

import java.util.Scanner;

//importar funcoes do ex3, o * é pra ser todas as funçoes
import static FichaPratica06.Ex_03_BibliotecaEx04.*;

public class Ex_04 {

    public static void main(String[] args) {

        //scanner
        Scanner input = new Scanner(System.in);

        //declarar variáveis
        int numero,opcao;

        System.out.println("Insira um número:");
        numero = input.nextInt();


        do {
            System.out.println("\n1. Par ou Ímpar");
            System.out.println("2. Positivo ou Negativo");
            System.out.println("3. Primo ou Não Primo");
            System.out.println("4. Perfeito ou Não Perfeito");
            System.out.println("5. Triangular ou Não Triangular");
            System.out.println("6. Trocar de Número");
            System.out.println("7. Sair");

            System.out.println("\nOpção");
            opcao = input.nextInt();


            switch (opcao){

                case 1:
                    if (par(numero)){
                        System.out.println("Par");
                    }else {
                        System.out.println("Impar");
                    }
                    break;

                case 2:
                    if (positivo(numero)){
                        System.out.println("O número é: Positivo");
                    }else {
                        System.out.println("O número é: Negativo");
                    }
                    break;

                case 3:
                    if (primo(numero)){
                        System.out.println("O número é: Primo");
                    }else {
                        System.out.println("O número é: Não Primo");
                    }
                    break;

                case 4:
                    if (perfeito(numero)){
                        System.out.println("O número é: Perfeito");
                    }else {
                        System.out.println("O número é: Não Perfeito");
                    }
                    break;

                case 5:
                    if (triangular(numero)){
                        System.out.println("O número é: Triangular");
                    }else {
                        System.out.println("O número é: Não Triangular");
                    }
                    break;

                case 6:
                    System.out.println("Introduza o novo número");
                    numero = input.nextInt();
                    break;

                default:
                    System.out.println("*| Opção inválida... |*");
            }

        }while (opcao!=7);

    }
}
