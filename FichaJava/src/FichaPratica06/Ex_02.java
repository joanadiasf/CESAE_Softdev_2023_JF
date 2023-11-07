package FichaPratica06;

import java.util.Scanner;

public class Ex_02 {


    /**
     * Metodo que lê um inteiro positivo do utilizador
     * @return Nr Inteiro Positivo
     */
    public static int lerInteiroPositivo(){

        Scanner input = new Scanner(System.in);

        int num;

        do {
            System.out.println("Insira um numero positivo: ");

            num = input.nextInt();
        }while(num<0);

        return num;
    }

    /**
     * Imprime nr de asteriscos = nr input
     * @param numeroAsteriscos
     */
    public static void imprimirAsterisco(int numeroAsteriscos){

        for (int i=0; i < numeroAsteriscos; i++){
            System.out.print("*");
        }

    }


    //ponto de partida do programa
    public static void main(String[] args) {

        //declarar variavel
        int numInteiro = lerInteiroPositivo();

        //função
        imprimirAsterisco(numInteiro);
    }
}
