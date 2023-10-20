package FichaPratica02;

import java.util.Scanner;
public class Ex_03 {

    public static void main(String[] args) {

        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        double salario;

        //Ler valores
        System.out.println("Salário anual: ");
        salario = input.nextDouble();

        //Condicional
        if (salario <= 15000){
            System.out.println("Taxa a pagar - 20% : " + salario * 0.2);
        }

        if (salario > 15000 && salario <= 20000){
            System.out.println("Taxa a pagar - 30% : " + salario * 0.3);
        }

        if (salario > 20000 && salario <= 25000){
            System.out.println("Taxa a pagar - 35% :" + salario * 0.35);
        }

        if (salario > 25000){
            System.out.println("Taxa a pagar - 40% :" + salario * 0.4);
        }
    }
}
