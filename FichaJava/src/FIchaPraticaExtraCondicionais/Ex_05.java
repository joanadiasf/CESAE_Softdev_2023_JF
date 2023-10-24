package FichaPraticaExtraCondicionais;

import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {

        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num, tentiva;

        //Ler variaveis
        num = 74;

        System.out.println(" Adivinhe o número de 1 a 100! ( 2 tentativas)");
        tentiva = input.nextInt();

        //Condicional

        if (tentiva <= 73 && tentiva > 1){

                if (tentiva < 55){
                    System.out.println("Muito baixo...");
                } else {
                    System.out.println("Baixo, mas perto.");
                }
        }


        if (tentiva < 100 && tentiva > 73 && tentiva !=74){

            if (tentiva > 85){
                System.out.println("Muito alto");
            } else {
                System.out.println("Alto, mas perto.");
            }
        }


        if (tentiva == num){
            System.out.println("Parabéns! Acertou.");
        }


    }
}
