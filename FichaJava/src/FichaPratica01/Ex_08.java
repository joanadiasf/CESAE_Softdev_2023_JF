package FichaPratica01;

import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args) {

        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int mintotal,segtotais, hora, minuto, segundo;

        //Ler tempos música

        System.out.println("Insira minutos faixa 1");
        mintotal = input.nextInt();

        System.out.println("Insira segundos faixa 1");
        segtotais = input.nextInt();

        System.out.println("Insira minutos faixa 2");
        mintotal = mintotal + input.nextInt();

        System.out.println("Insira segundos faixa 2");
        segtotais = segtotais + input.nextInt();

        System.out.println("Insira minutos faixa 3");
        mintotal = mintotal + input.nextInt();

        System.out.println("Insira segundos faixa 3");
        segtotais = segtotais + input.nextInt();

        System.out.println("Insira minutos faixa 4");
        mintotal = mintotal + input.nextInt();

        System.out.println("Insira segundos faixa 4");
        segtotais = segtotais + input.nextInt();

        System.out.println("Insira minutos faixa 5");
        mintotal = mintotal + input.nextInt();

        System.out.println("Insira segundos faixa 5");
        segtotais = segtotais + input.nextInt();

        //Somar tempos e converter
//        segundo = (seg1 + seg2 + seg3 + seg4 + seg5) % 60;
//        minuto = ((seg1 + seg2 + seg3 + seg4 + seg5) / 60) + (min1 + min2 + min3 + min4 + min5) % 60 ;
//        hora = (min1 + min2 + min3 + min4 + min5) / 60;

        //Apresentar resultado
        System.out.println(hora + ":" + minuto + ":" + segundo);

    }
}
