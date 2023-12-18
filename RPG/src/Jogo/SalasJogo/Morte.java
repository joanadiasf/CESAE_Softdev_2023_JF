package Jogo.SalasJogo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Morte {


    public static void morte() throws FileNotFoundException {


        // Instanciar o Scanner para um ficheiro com o caminho recebido como parâmetro
        Scanner fileScanner = new Scanner(new File("src/Jogo/SalasJogo/morte.txt"));

        String linha;


        System.out.println("\n* * * * G A M E   O V E R * * * *");

        while (fileScanner.hasNextLine()) {
            linha = fileScanner.nextLine();

            System.out.println(linha);
        }

    }

}
