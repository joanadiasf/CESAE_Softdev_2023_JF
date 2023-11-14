package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Ex_11 {

    public static void main(String[] args) throws FileNotFoundException {

        //scanner de ficheiro
        Scanner fileScanner = new Scanner(new File("FichaJava/Ficheiros/exercicio_11.csv"));


        String artista,genero,nome;
        double duracao;
        int i=0;


        String linha= fileScanner.nextLine(); //linha cabeçalho;

        String[][] matriz = new String[46][4];
        
        //ler ficheiro e transformar em matriz
        while (fileScanner.hasNextLine()){

            //as "colunas" são divididas por , então: split
            String[] divisor = linha.split(",");


            matriz[i][0] = divisor[i];
            matriz[i][1] = divisor[i];
            matriz[i][2] = divisor[i];
            matriz[i][3] = divisor[i];

            i++;

        }

    }
}

//ler ficheiro csv (nome,artista,género,duração) pra uma matriz
//criar menu com opções:

//1pesquisar por genero
//2 ´´ por artista
//3 ´´ maior duração
//4 ´´ acima de um valor especificado
//4 ´´ nr de musicas no ficheiro



