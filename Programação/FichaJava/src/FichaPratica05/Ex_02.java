package FichaPratica05;

import java.util.Scanner;
public class Ex_02 {

    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variavel de vetor
        int[] vetor=new int[12];
        int comissao = 0;
        
        
        //Ler vetor (como sabemos qts x vai ser lido, usamos um ciclo for
        for ( int indice=0; indice < 12; indice++){

            System.out.println("Insira o seu rendimento do mês " + indice);
            vetor[indice]= input.nextInt();

        //tenho que por vetor[x] e nao só o x, senao não vai somar o input
            comissao= comissao + vetor[indice];
        }

        System.out.println("O seu total de comissões anual é: " + comissao);
    }
}
