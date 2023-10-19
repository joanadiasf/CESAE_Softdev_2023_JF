package FichaPratica01;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Ex_01 {

    public static void main(String[] args) {

        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int num1,num2,soma;

        //Ler num1
        System.out.println("Insira um número");
        num1= input.nextInt();

        //Ler num2
        System.out.println("Insira um número");
        num2= input.nextInt();

        //Calcular soma num1 e num2
        soma= num1+num2;

                //Apresentar a soma
        System.out.println( " A soma é:" + soma);

    }

}
