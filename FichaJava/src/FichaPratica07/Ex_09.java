package FichaPratica07;

//importar files

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Ex_09 {

    public static void main(String[] args) throws FileNotFoundException {

        //ler ficheiro
        Scanner fileScanner = new Scanner(new File("FichaJava/Ficheiros/exercicio_09.txt"));

        String linha;
        int contaPalavras=0;

        while (fileScanner.hasNextLine()){
            linha = fileScanner.nextLine();


            String[] palavras = linha.split(" ");

            for (int i=0; i < palavras.length;i++){

                contaPalavras++;

            }

        }
        System.out.println("Número de palavras: "+ contaPalavras);

        String [] grandeVetor = new String[contaPalavras];

        while (fileScanner.hasNextLine()){
            linha = fileScanner.nextLine();

            String[] palavras = linha.split(" ");

            for (int i =0; i < grandeVetor.length;i++){

                

            }

        }


    }
}

//ler ficheiro
//imprimir palavra mais frequente


//1 contar nr palavras
//2criar vetor c este tamanho
//3pegar numa linha
//4limpar a linha
//5split
//6passar cada posição para o vetor
//voltar passo 3

//7 analisar vetor grande

//contador pra nao perder a posicao da linha anterior