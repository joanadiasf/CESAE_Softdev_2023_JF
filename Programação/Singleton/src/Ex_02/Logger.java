package Ex_02;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {

    private final String nomeFicheiro;

    private static Logger instance;

    public Logger(String nomeFicheiro) {
        this.nomeFicheiro = nomeFicheiro;
    }

    public static Logger getInstance(String nomeFicheiro) {

        if (instance == null) {
            instance = new Logger(nomeFicheiro);
        }

        return instance;
    }

    //escrever Logs
    public void log(String textoLog) throws IOException {


        // Creates a FileWriter
        FileWriter output = new FileWriter(nomeFicheiro,true);

        // Writes the string to the file
        output.append(textoLog);

        // Closes the writer
        output.close();

    }
    //apagar Logs e recomeçar
    public void limparConteudoLog() throws FileNotFoundException {

        PrintWriter printWriter = new PrintWriter(nomeFicheiro);

        printWriter.close();

    }


}
