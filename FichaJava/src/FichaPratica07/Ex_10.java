package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Ex_10 {

    public static void main(String[] args) throws FileNotFoundException {

        //scanner de ficheiro
        Scanner fileScanner = new Scanner(new File("FichaJava/Ficheiros/exercicio_10.csv"));

        //ler primeira linha
        String linha= fileScanner.nextLine(); //linha cabeçalho

        String tipoProd,prod;
        double quantidade,valor,total=0;

        //separar info por variavel para conseguir chegar ao valor
        while (fileScanner.hasNextLine()){

            //as "colunas" são divididas por , então: split
            String[] palavras = linha.split(",");

            //sei q os valores q quero multiplicar estao na posição 2 e 3 do vetor entao:
            valor=(Double.parseDouble(palavras[2])*Double.parseDouble(palavras[3]));

            total+= valor;


        }

        System.out.println("Total: " + total);
        fileScanner.close();

    }
}

//ler ficheiro cvs (tipo de produto,produto,quantidade,valor)
//calcular valor das vendas