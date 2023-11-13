package FichaPraticaExtraFuncoes;

import java.util.Scanner;

public class Ex_03 {

    public static double calcularAreaRetangulo (double base, double altura){

        double area;

        area=base*altura;

        return area;

    }

    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        double base, altura;

        System.out.println("Insira a base do retângulo:");
        base = input.nextInt();

        System.out.println("Insira a altura do retângulo:");
        altura = input.nextInt();

        System.out.println("A área do seu retângulo é: " + calcularAreaRetangulo(base,altura));

    }
}
