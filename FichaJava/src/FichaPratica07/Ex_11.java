package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Ex_11 {

    public static void main(String[] args) throws FileNotFoundException {

        //scanner de ficheiro
        Scanner fileScanner = new Scanner(new File("FichaJava/Ficheiros/exercicio_11.csv"));


        String artista,genero,nome,duracao;
        int i=0,opcao;



        String linha= fileScanner.nextLine(); //linha cabeçalho;

        String[][] matriz = new String[46][4];

        //ler ficheiro e transformar em matriz
        while (fileScanner.hasNextLine() ){
            linha = fileScanner.nextLine();

            //as "colunas" são divididas por , então: split
            String[] divisor = linha.split(",");


            for (int c = 0; c < 4 && c < divisor.length; c++) {

                matriz[i][c] = divisor[c];
            }

            i++;

        }

        fileScanner.close();

        //reiniciar o scanner
        Scanner fileScanner2 = new Scanner(new File("FichaJava/Ficheiros/exercicio_11.csv"));

        Scanner input = new Scanner(System.in);

        while (fileScanner.hasNextLine() ){

            nome = matriz[0][0];
            artista = matriz[0][1];
            genero = matriz[0][2];
            duracao = matriz[0][3];

        }

        //"menu"
        do {

            System.out.println("Escolha entre as seguintes opções:");
            System.out.println("1. Pesquisar por género");
            System.out.println("2. Pesquisar por artista");
            System.out.println("3. Pesquisar música de maior duração");
            System.out.println("4. Pesquisar música acima de *insira tempo*");
            System.out.println("5. Saber quantas músicas tem no seu ficheiro");

            System.out.println();

            opcao=input.nextInt();

            switch (opcao){

                case 1:
                    System.out.println(matriz[i][1]);
                break;

                case 2:
                    System.out.println(matriz[i][2]);
                    break;

                case 3:
                    System.out.println();
                    break;

                case 4:
                    System.out.println();
                    break;

                case 5:
                    System.out.println();
                    break;

            }
        }while (opcao!=6);


        //para apresentar a matriz

//        String strg = "";
//
//        //pra ler matriz e por nrs seguidos
//        for (int l=0; l <matriz.length; l++){
//            for (int c =0; c <matriz[0].length; c++){
//
//                strg += matriz[l][c] + "\t";
//            }
//            strg += "\n";
//        }
//
//        //imprimir FORA do for para so aparecer o que se quer
//        System.out.println("\n");
//        System.out.println(strg);


    }
}

//ler ficheiro csv (nome,artista,género,duração) pra uma matriz
//criar menu com opções:

//1pesquisar por genero
//2 ´´ por artista
//3 ´´ maior duração
//4 ´´ acima de um valor especificado
//5 ´´ nr de musicas no ficheiro



