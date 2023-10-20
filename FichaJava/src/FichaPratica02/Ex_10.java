package FichaPratica02;

import java.util.Scanner;
public class Ex_10 {

    public static void main(String[] args) {

        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int num1,num2,operacao;

        //Ler numeros
        System.out.println("Insira um número: ");
        num1 = input.nextInt();

        System.out.println("Insira um número: ");
        num2 = input.nextInt();

        //Descrever ação utilizador
        System.out.println("Escolha operação: \n Adição(1)     Subtração(2)     Divisão(3)     Multiplicação(4) ");
        operacao = input.nextInt();

        //Condicional
        switch (operacao){

            case 1:
                System.out.println( "Resultado: " + (num1 + num2) );
                break;

            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;

            case 3:
                System.out.println("Resultado: " + (num1 / num2));
                break;

            case 4:
                System.out.println("Resultado: " + (num1 * num2));
                break;

            default:
                System.out.println("Inválido. Tente de novo.");

        }
    }
}
