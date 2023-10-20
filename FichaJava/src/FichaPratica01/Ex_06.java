package FichaPratica01;

import java.util.Scanner;
public class Ex_06 {

    public static void main(String[] args) {

        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int valor1,valor2,valoraux;

        //Ler valores
        System.out.println("Insira um valor");
        valor1 = input.nextInt();

        System.out.println("Insira um valor");
        valor2 = input.nextInt();

        //Apresentar valores

        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);

        //Trocar valores
        System.out.println("Troca: ");

        valoraux=valor1;
        valor1=valor2;
        valor2=valoraux;

        //Apresentar valores trocados
        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);


        //Parte2
        System.out.println("Valor 1: " + valor2);
        System.out.println("Valor 2: " + valor1);

    }
}
