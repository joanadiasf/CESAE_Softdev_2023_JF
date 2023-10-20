package FichaPratica02;

import java.util.Scanner;
public class Ex_09 {

    public static void main(String[] args) {


        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int num1,num2,num3;

        //Ler variaveis
        System.out.println("Insira um número: ");
        num1 = input.nextInt();

        System.out.println("Insira um número: ");
        num2 = input.nextInt();

        System.out.println("Insira um número: ");
        num3 = input.nextInt();

        //Apresentar menor dos três

        if (num1<num2 && num2<num3){
            System.out.println("O menor número é: " + num1);
        }

        if (num2<num3 && num1>num2){
            System.out.println("O menor número é: " + num2);
        }

        if (num3 < num2 && num1 > num3) {
            System.out.println("O menor número é: " + num3);
        }


    }
}
