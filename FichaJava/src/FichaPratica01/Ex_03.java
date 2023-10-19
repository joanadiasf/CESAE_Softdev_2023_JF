package FichaPratica01;

import java.util.Scanner;
public class Ex_03 {
    public static void main(String[] args) {


        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        double larg,comp,peri,area;

        //Ler largura
        System.out.println(" Insira a largura: ");
        larg= input.nextDouble();

        //Ler comprimento
        System.out.println(" Insira o comprimento: ");
        comp= input.nextDouble();

        //Calcular perimetro
        peri= 2*(larg+comp);

        //Apresentar perimetro
        System.out.println( " Perimetro: " + peri);

        //Calcular area
        area= larg*comp;

        //Apresentar area
        System.out.println("Area: " + area);

    }
}
