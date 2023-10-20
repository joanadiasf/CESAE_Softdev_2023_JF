package FichaPratica01;

import java.util.Scanner;
public class Ex_08 {

    public static void main(String[] args) {

        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int min1,seg1,min2,seg2,min3,seg3,min4,seg4,min5,seg5,hora,minuto,segundo;

        //Ler tempos música
        System.out.println("Insira minutos faixa 1");
        min1= input.nextInt();

        System.out.println("Insira segundos faixa 1");
        seg1= input.nextInt();

        System.out.println("Insira minutos faixa 2");
        min2= input.nextInt();

        System.out.println("Insira segundos faixa 2");
        seg2= input.nextInt();

        System.out.println("Insira minutos faixa 3");
        min3= input.nextInt();

        System.out.println("Insira segundos faixa 3");
        seg3= input.nextInt();

        System.out.println("Insira minutos faixa 4");
        min4= input.nextInt();

        System.out.println("Insira segundos faixa 4");
        seg4= input.nextInt();

        System.out.println("Insira minutos faixa 5");
        min5= input.nextInt();

        System.out.println("Insira segundos faixa 5");
        seg5= input.nextInt();

        //Somar tempos e converter
        segundo = (seg1 + seg2 + seg3 + seg4 + seg5) % 60;
        minuto = ((seg1 + seg2 + seg3 + seg4 + seg5) / 60) + (min1 + min2 + min3 + min4 + min5) % 60 ;
        hora = (min1 + min2 + min3 + min4 + min5) / 60;

        //Apresentar resultado
        System.out.println( hora + ":" + minuto + ":" + segundo );

    }
}
