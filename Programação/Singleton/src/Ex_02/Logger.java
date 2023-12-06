package Ex_02;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Logger {

    private final String nomeFicheiro;

    private static Logger instance;

    private Logger(String nomeFicheiro) {
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

        LocalDateTime localDateTime= LocalDateTime.now();

        // Writes the string to the file
        output.append(localDateTime + ": " + textoLog+"\n");

        // Closes the writer
        output.close();

    }
    //apagar Logs e recomeçar
    public void limparConteudoLog() throws FileNotFoundException {

        PrintWriter printWriter = new PrintWriter(nomeFicheiro);

        printWriter.close();

    }


}
