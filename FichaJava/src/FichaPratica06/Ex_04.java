package FichaPratica06;

import java.util.Scanner;

//importar funcoes do ex3, o * é pra ser todas as funçoes
import static FichaPratica06.Ex_03.*;

public class Ex_04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero,opcao;

        System.out.println("Insira um nr:");
        numero = input.nextInt();

        do {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            System.out.println("5");
            System.out.println("6");
            System.out.println("7");

            System.out.println("Opção");
            opcao = input.nextInt();


            switch (opcao){

                case 1:
                    if (par(numero)){
                        System.out.println("Par");
                    }else {
                        System.out.println("Impar");
                    }
                    break;
                    
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;

                default:
                    System.out.println("Invalido");
            }

        }while (opcao!=7);

    }
}
