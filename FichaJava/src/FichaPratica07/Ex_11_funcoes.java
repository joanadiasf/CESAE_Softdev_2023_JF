package FichaPratica07;

import java.util.Scanner;

public class Ex_11_funcoes {

    /**
     * Método para pesquisar Genero
     * @param matriz - ser analisada
     */
    public static void pesquisarGenero(String[][] matriz){

        Scanner input = new Scanner(System.in);

        String generoProcura;

        System.out.println("Qual o género a pesquisar?");
        generoProcura = input.next();

        for (int l=0; l < matriz.length;l++){

                if (generoProcura.equals(matriz[l][2])){
                    System.out.println(matriz[l][2]);
                }

        }
    }


    /**
     * Método para pesquisar Artista
     * @param matriz - ser analisada
     */
    public static void pesquisarArtista(String[][] matriz){


        Scanner input = new Scanner(System.in);

        String artistaProcura;

        System.out.println("Qual o artista a pesquisar?");
        artistaProcura = input.next();

        for (int l=0; l < matriz.length;l++){

            if (artistaProcura.equals(matriz[l][1])){
                System.out.println(matriz[l][1]);
            }
        }
    }
}
//pergunta utilizador
//input
//pesquisar na matriz

