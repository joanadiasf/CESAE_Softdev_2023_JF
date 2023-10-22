package FichaPratica02;

import java.util.Scanner;
public class Ex_13 {

    public static void main(String[] args) {

        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int hora,minuto;

        //Ler variáveis
        System.out.println("Introduza horas: ");
        hora = input.nextInt();

        System.out.println("Introduza minutos: ");
        minuto = input.nextInt();

        //Condicional

        if (hora >=0  && hora <=12 ){

            System.out.println(hora + ":" + minuto + "AM");
        }

        else {hora= hora-12;
            System.out.println(hora + ":" + minuto + "PM");
        }

    }
}
