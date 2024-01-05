package Jogo.SalasJogo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CharacterScreen {

    /**
     * GameOver screen
     * @throws FileNotFoundException - txt file
     */
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

    /**
     * Boss screen
     * @throws FileNotFoundException - txt file
     */
    public static void tobias() throws FileNotFoundException {


        // Instanciar o Scanner para um ficheiro com o caminho recebido como parâmetro
        Scanner fileScanner = new Scanner(new File("src/Jogo/SalasJogo/tobias.txt"));

        String linha;


        while (fileScanner.hasNextLine()) {
            linha = fileScanner.nextLine();

            System.out.println(linha);
        }

    }

    /**
     * Title screen
     * @throws FileNotFoundException - txt file
     */
    public static void titleScreen () throws FileNotFoundException{

        // Instanciar o Scanner para um ficheiro com o caminho recebido como parâmetro
        Scanner fileScanner = new Scanner(new File("src/Jogo/SalasJogo/gameTitle.txt"));

        String linha;


        while (fileScanner.hasNextLine()) {
            linha = fileScanner.nextLine();

            System.out.println(linha);
        }

    }

}
