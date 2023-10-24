package FichaPratica03;

import java.util.Scanner;
public class Ex_04 {
    public static void main(String[] args) {

        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numfinal,num;
        num = 0;

        //Ler variavel
        System.out.println("Insira um número");
        numfinal = input.nextInt();
        System.out.println("\n");

        while (numfinal >= num){
            System.out.println(num);

            num= num +1;
        }

    }
}
