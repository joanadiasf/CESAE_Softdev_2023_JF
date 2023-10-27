package FichaPratica03;

import java.util.Scanner;
public class Ex_07 {

    public static void main(String[] args) {

        // Instanciar o Scanner obligatorio para todos os exercicios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num, num2;

        //Ler variáveis
        System.out.println("Insira um número inteiro: \n");
        num = input.nextInt();

        num2 = num - 5;

        //Loop

        while (num2 < num){
            System.out.println(num2);
            num2++;
        }
        

        while (num2 <= num + 5){
            System.out.println(num2);
            num2++;
        }
    }
}
