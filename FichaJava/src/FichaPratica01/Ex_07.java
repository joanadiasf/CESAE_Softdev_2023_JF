package FichaPratica01;

import java.util.Scanner;
public class Ex_07 {

    public static void main(String[] args) {

        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        double prod1,prod2,prod3,pagar;

        //Ler preços
        System.out.println("Insira um número");
        prod1= input.nextDouble();

        System.out.println("Insira um número");
        prod2= input.nextDouble();

        System.out.println("Insira um número");
        prod3= input.nextDouble();

        //Preço (conta ?????)
        pagar = (prod1 + prod2 + prod3) * 0.9;

        //Apresentar valor a pagar com desconto
        System.out.println("Valor a pagar: " + pagar);
    }
}
