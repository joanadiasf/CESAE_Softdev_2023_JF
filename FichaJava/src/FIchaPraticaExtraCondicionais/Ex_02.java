package FIchaPraticaExtraCondicionais;

import java.util.Scanner;
public class Ex_02 {

    public static void main(String[] args) {

        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double peso;

        //Ler peso
        System.out.println("Insira o seu peso(em KG): \n");
        peso = input.nextDouble();

        if (peso > 0){
            System.out.println("O seu peso na lua é: \n" + (peso*0.16));
        }
            else {
            System.out.println("*| Peso inválido... | *");
        }
    }
}
