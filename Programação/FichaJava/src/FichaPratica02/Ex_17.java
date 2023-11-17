package FichaPratica02;

import java.util.Scanner;
public class Ex_17 {

    public static void main(String[] args) {

        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double valor,credito;

        //Ler valor
        System.out.println("Insira o seu salário médio: ");
        valor = input.nextDouble();

        //Condicionais

        if (valor > 0 && valor <= 2000){
            credito = valor;
            System.out.println("Saldo médio: " + valor + "Crédito: Nenhum crédito");
        }

        if (valor > 2000 && valor <= 4000){
            credito = valor * 0.2;
            System.out.println("Saldo médio: " + valor + "Crédito: " + credito);
        }

        if (valor > 4000 && valor <= 6000){
            credito = valor * 0.3;
            System.out.println("Saldo médio: " + valor + "Crédito: " + credito);
        }

        if (valor > 6000){
            credito = valor * 0.4;
            System.out.println("Saldo médio: " + valor + "Crédito: " + credito);
        }
    }
}
