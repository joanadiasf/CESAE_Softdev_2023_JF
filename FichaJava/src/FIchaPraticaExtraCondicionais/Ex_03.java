package FIchaPraticaExtraCondicionais;

import java.util.Scanner;
public class Ex_03 {
    public static void main(String[] args) {
        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double preco;

        //Ler preço
        System.out.println("Insira o preço" );
        preco = input.nextDouble();

        //Condicionais
        if (preco >= 100){
            System.out.println("Preço final: " + (preco * 0.1) + "(10% de Desconto");
        }
            else {
            System.out.println("Preço final: " + preco + "(Sem desconto)");
        }
    }
}
