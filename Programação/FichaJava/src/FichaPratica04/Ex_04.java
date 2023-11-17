package FichaPratica04;

import java.util.Scanner;
public class Ex_04 {

    public static void main(String[] args) {

        //Scanner

        Scanner input = new Scanner(System.in);

        //Declarar + ler variaveis

        //Boolean serve para quando precisamos que algo seja true ou false (uma coisa ou outra)

        int valor;
        boolean primo=true;

        System.out.println("Insira um número para verificar se é um número primo: \n");
        valor = input.nextInt();


        for (int divisor=2; divisor < valor; divisor++){


            //avaliar se ha algum divisor outro que 1 e o proprio nr
            if (valor % divisor==0){
                System.out.println("Número deixa de ser primo");
                primo=false;
            }
        }


        //Se o nr não for primo a boolean vai ser false e vai ser lido o else ao invés do if
        //caso o nr seja primo ele não vai nem entrar no loop e vai ser lido como primo

        if (primo){
            System.out.println("Primo");
        }else {
            System.out.println("Não primo");
        }


    }
}
