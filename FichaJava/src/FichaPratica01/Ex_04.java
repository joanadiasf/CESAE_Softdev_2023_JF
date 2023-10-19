package FichaPratica01;

import java.util.Scanner;
public class Ex_04 {
    public static void main(String[] args) {

        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        double raio,area,pi;

        //pi
        pi=3.14;

        //Ler raio
        System.out.println("Insira um número");
        raio = input.nextDouble();
        
        //Calcular area
        area= pi*(raio*raio);

        //Apresentar area
        System.out.println("A área é: " + area);



    }
}
