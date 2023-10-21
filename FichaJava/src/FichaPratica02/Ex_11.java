package FichaPratica02;

import java.util.Scanner;

public class Ex_11 {

    public static void main(String[] args) {

        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        double num1,num2,creditar,debitar;

        //Ler / input
        System.out.println("Saldo da conta bancária: ");
        num1 = input.nextDouble();

        System.out.println("Montante a creditar/debitar: ");
        num2 = input.nextDouble();

        //if else

        debitar = num1 - num2;
        creditar = num1 + num2;

        if (debitar >= 0 && creditar >=0){
            System.out.println("Saldo atual: " + creditar);
        }

        else {
            System.out.println("Saldo atual negativo!");
        }
    }
}
