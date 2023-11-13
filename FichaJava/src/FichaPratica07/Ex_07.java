package FichaPratica07;


//importar files

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Ex_07 {

    public static void main(String[] args) throws FileNotFoundException {


        Scanner fileScanner = new Scanner(new File("Ficheiros/exercicio_07.txt"));

        //ler ficheiro
        String linha;
        int contaLinhas=0,contaPalavras=0;

        while (fileScanner.hasNextLine()){
            linha = fileScanner.nextLine();
            System.out.println(linha);



            contaLinhas++;
        }

        //espaçamento
        System.out.println();


        System.out.println("O nr de linhas é: " + contaLinhas);

        // ****************** PARTE DOIS ******************

        Scanner fileScanner2 = new Scanner(new File("Ficheiros/exercicio_07.txt"));

        //chatgpt diz que é com vetor string
        while (fileScanner2.hasNextLine()){

            linha = fileScanner2.nextLine();
            String[] palavras = linha.split(" ");

            for (int i=0; i < palavras.length;i++){

                contaPalavras++;

            }
        }

        System.out.println("O nr de palavras é: " + contaPalavras);



    }
}

//ler ficheiro
//imprimir nr linhas
//imprimir nr palavras