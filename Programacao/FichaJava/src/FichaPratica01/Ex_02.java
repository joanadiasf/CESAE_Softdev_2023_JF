package FichaPratica01;

import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args) {

        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        double num1,num2,soma,sub,divi,multi;

        //Ler num1
        System.out.println("Insira um número");
        num1= input.nextDouble();

        //Ler num2
        System.out.println("Insira um número");
        num2= input.nextDouble();

        //Calcular soma num1 e num2
        soma= num1+num2;

        //Apresentar a soma
        System.out.println( " A soma é:" + soma);

        //Calcular subtração num1 e num2
        sub= num1-num2;

        //Apresentar a subtração
        System.out.println( " A subtração é:" + sub);

        //Calcular divisão num1 e num2
        divi= num1/num2;

        //Apresentar a divisão
        System.out.println(" A divisão é:" + divi);

        //Calcular a multiplicação
        multi= num1*num2;

        //Apresentar multiplicação
        System.out.println(" A multiplicação é:" + multi);

    }
}
