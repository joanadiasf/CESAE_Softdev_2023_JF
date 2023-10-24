package FichaPratica02;

import java.util.Scanner;
public class Ex_15 {

    public static void main(String[] args) {
        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1,num2,num3,opcao;

        //Ler variáveis
        System.out.println("Insira três números separados por Enter");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        System.out.println("Ordem crescente (C) ou Ordem decrescente (D)");
        opcao = input.nextInt();

        //Condicionais

//        switch (opcao){
//
//            case "C":
//
//                if (num1 < num2 && num2 < num3);{
//                System.out.println("Ordem crescente: " + num1 + " "+ num2 + " "+ num3);
//            }
//
//            if (num1 < num2 && num3 < num2);{
//                System.out.println("Ordem crescente: " + num1 + " " + num3 + " " + num2);
//            }
//
//            if (num2 < num3 && num3 < num1);{
//                System.out.println("Ordem crescente: " + num2 + " " + num3 + " " + num1);
//            }
//
//            if (num2 < num3 && num1 < num3);{
//                System.out.println("Ordem crescente: " + num2 + " " + num1 + " " + num3);
//            }
//
//            if (num3 < num1 && num1 < num2);{
//                System.out.println("Ordem crescente: " + num3 + " " + num2 + " " + num3);
//            }
//
//            if (num3 < num1 && num2 < num1);{
//                System.out.println("Ordem crescente: " + num3 + " " + num2 + " " + num1);
//            }
//            break;
//
//            case "D":
//                if (num1 < num2 && num2 < num3);{
//                System.out.println("Ordem decrescente: " + num3 + " "+ num2 + " "+ num1);
//            }
//
//            if (num1 < num2 && num3 < num2);{
//                System.out.println("Ordem decrescente: " + num2 + " " + num3 + " " + num1);
//            }
//
//            if (num2 < num3 && num3 < num1);{
//                System.out.println("Ordem decrescente: " + num1 + " " + num3 + " " + num2);
//            }
//
//            if (num2 < num3 && num1 < num3);{
//                System.out.println("Ordem decrescente: " + num3 + " " + num1 + " " + num2);
//            }
//
//            if (num3 < num1 && num1 < num2);{
//                System.out.println("Ordem decrescente: " + num3 + " " + num2 + " " + num1);
//            }
//
//            if (num3 < num1 && num2 < num1);{
//                System.out.println("Ordem decrescente: " + num1 + " " + num2 + " " + num3);
//            }
//            break;
//        }


    }
}
