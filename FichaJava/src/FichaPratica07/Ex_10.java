package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Ex_10 {

    public static void main(String[] args) throws FileNotFoundException {

        //scanner de ficheiro - o path tem q estar correto
        Scanner fileScanner = new Scanner(new File("FichaJava/Ficheiros/exercicio_10.csv"));

        //String - para poder ler linha de texto
        String linha= fileScanner.nextLine(); //linha cabeçalho

        String tipoProd,prod;
        double quantidade,valor,total=0;

        while (fileScanner.hasNextLine()){

            System.out.println(linha);
        }


    }
}

//ler ficheiro cvs (tipo de produto,produto,quantidade,valor)
//calcular valor das vendas