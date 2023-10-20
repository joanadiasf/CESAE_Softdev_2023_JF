package FichaPratica02;

import java.util.Scanner;
public class Ex_02 {

    public static void main(String[] args) {

        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        double salario;

        //Ler valores
        System.out.println("Salário anual: ");
        salario = input.nextDouble();

        //Condicional

        if (salario <= 15000)
            System.out.println("Taxa a pagar (20%): " + salario * 0.2);

        else
            System.out.println("Taxa a pagar (30%): " + salario * 0.3);

    }
}
