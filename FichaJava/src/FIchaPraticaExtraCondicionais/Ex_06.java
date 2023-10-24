package FichaPraticaExtraCondicionais;

import java.util.Scanner;

public class Ex_06 {

    public static void main(String[] args) {

        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int ano;

        //Ler ano
        System.out.println("Insira o ano(entre 2012 e 2024): \n");
        ano = input.nextInt();

        //Condicional

        if (ano == 2012 || ano == 2016 || ano == 2020 || ano ==2024){
            System.out.println("O ano é bissexto");
        }

        else {
            System.out.println("O ano não é bissexto.");
        }

    }
}
