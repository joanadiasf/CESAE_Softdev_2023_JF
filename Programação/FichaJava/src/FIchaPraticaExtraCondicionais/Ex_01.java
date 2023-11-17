package FichaPraticaExtraCondicionais;

import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) {

        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int idade;

        //Ler idade
        System.out.println("Insira a sua idade: \n");
        idade = input.nextInt();

        //Condicionais
        if (idade >=18){
            System.out.println("Maior de idade");
        }
            else {
            System.out.println("Menor de idade");
        }
    }
}
