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
                  System.out.println("Música: "+matriz[l][0] + "Artista" + matriz[l][1]);
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
                System.out.println("Música: "+matriz[l][0] + "Artista" + matriz[l][1]);
            }
        }
    }

    /**
     * Método para pesquisar maior duração de música
     * @param matriz- ser analisada
     */
    public static void pesquisarDuracaoMusica(String[][] matriz){

        double musica= Double.parseDouble(matriz[0][3]);
        double maiorDuracao;
        String linhaMusica = matriz[0][0];



        for (int l=0; l < matriz.length;l++){

            maiorDuracao= Double.parseDouble(matriz[l][3]);

            if (maiorDuracao < musica){

                maiorDuracao=musica;
                linhaMusica=matriz[l][0];
            }
        }

        System.out.println("A música com maior duração é: " + linhaMusica);

    }

    /**
     * Método para pesquisar música com mais duração que a introduzida pelo utilizador
     * @param matriz - ser analisada
     */
    public static void musicaAcimaTempo(String [][]matriz){

        Scanner input = new Scanner(System.in);

        matriz[0][3]=matriz[0][3].replace(":",".");

        double musica= Double.parseDouble(matriz[0][3]);
        double acimaTempo;
        String linhaMusica = matriz[0][0];

        System.out.println("Qual o mínimo de duração que procura? (Use . para separar os minutos dos segundos) ");
        acimaTempo= input.nextDouble();

        for (int l=0;l < matriz.length; l++){

            if (acimaTempo>musica){

                linhaMusica=matriz[l][3];
            }
        }

        System.out.println("A música com mais duração que a pesquisada é: " + linhaMusica);
    }


    /**
     * Método para contar as "linhas" da matriz
     * @param matriz - ser analisada
     */
    public static void musicasFicheiro(String[][]matriz){

        int contadorMusicas=0;

        for (int l =0; l < matriz.length;l++){

            contadorMusicas++;

        }

        System.out.println("Tem " + contadorMusicas + "músicas no ficheiro!");
    }
}
//pergunta utilizador
//input
//pesquisar na matriz

