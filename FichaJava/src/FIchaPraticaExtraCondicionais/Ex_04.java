package FIchaPraticaExtraCondicionais;

import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {

        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        String letra;

        //Ler variavel
        System.out.println("Insira uma letra (em minúsculas");
        letra = input.next();

        //Condicional
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o")|| letra.equals("u")){
            System.out.println("A letra escolhida é uma VOGAL.");
        } else {
            System.out.println("A letra escolhida é uma CONSOANTE.");
        }

    }
    
}

