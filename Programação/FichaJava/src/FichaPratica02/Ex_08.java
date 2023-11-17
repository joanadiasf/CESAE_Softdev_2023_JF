package FichaPratica02;

import java.util.Scanner;
public class Ex_08 {

    public static void main(String[] args) {

        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        double nota1,nota2,nota3,mediap;

        //Ler variaveis
        System.out.println("Introduzir 1º nota: ");
        nota1= input.nextDouble();

        System.out.println("Introduzir 2º nota: ");
        nota2= input.nextDouble();

        System.out.println("Introduzir 3º nota: ");
        nota3= input.nextDouble();

        //Calcular a media
        mediap=(nota1*0.25) + (nota2*0.35) + (nota3*0.4);
        System.out.println(" A média final ponderada é: " + mediap);

        //Avaliar
        if (mediap >=9.5){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
