package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica07.Ex_11_funcoes.*;
public class Ex_11 {

    public static void main(String[] args) throws FileNotFoundException {

        //scanner de ficheiro
        Scanner fileScanner = new Scanner(new File("Ficheiros/exercicio_11.csv"));


        int i=0,opcao;


        String linha= fileScanner.nextLine(); //linha cabeçalho;

        //declarar matriz
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

           // nome = matriz[0][0];
           // artista = matriz[0][1];
           // genero = matriz[0][2];
           // duracao = matriz[0][3];

        }

        fileScanner.close();

        //para receber input do menu
        Scanner input = new Scanner(System.in);



        //"menu"
        do {

            System.out.println("Escolha entre as seguintes opções:");
            System.out.println("1. Pesquisar por género");
            System.out.println("2. Pesquisar por artista");
            System.out.println("3. Pesquisar música de maior duração");
            System.out.println("4. Pesquisar música acima de *insira tempo*");
            System.out.println("5. Saber quantas músicas tem no seu ficheiro");
            System.out.println("6. Sair");

            //espaçamento
            System.out.println();

            opcao=input.nextInt();

            //menu
            switch (opcao){

                case 1:
                    pesquisarGenero(matriz);
                break;

                case 2:
                    pesquisarArtista(matriz);
                    break;

                case 3:
                    pesquisarDuracaoMusica(matriz);
                    break;

                case 4:
                    musicaAcimaTempo(matriz);
                    break;

                case 5:
                    musicasFicheiro(matriz);
                    break;

                default:
                    System.out.println("*****| Opção inválida |*****");
            }

        }while (opcao!=6);


    }
}

//ler ficheiro csv (nome,artista,género,duração) pra uma matriz
//criar menu com opções:

//1pesquisar por genero
//2 ´´ por artista
//3 ´´ maior duração
//4 ´´ acima de um valor especificado
//5 ´´ nr de musicas no ficheiro



