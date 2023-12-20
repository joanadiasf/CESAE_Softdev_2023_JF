package Entidades.TipoHerois;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class BibliotecaFuncoesComuns {

    public static void lerFicheiro(String filepath) throws FileNotFoundException {

        // Instanciar o Scanner para um ficheiro com o caminho recebido como parâmetro
        Scanner fileScanner = new Scanner(filepath);

        String linha;

        while (fileScanner.hasNextLine()) {
            linha = fileScanner.nextLine();

            System.out.println(linha);

        }



    }
}
