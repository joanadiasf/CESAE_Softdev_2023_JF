package Ex_02;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getInstance("application_log.txt");

        logger.log("Mensagem de log 1");
        logger.log("\nMensagem de log 2");
        logger.log("\nMensagem de log 3");
        logger.log("\nMensagem de log 4");
        logger.log("\nMensagem de log 5");

        logger.limparConteudoLog();

        logger.log("Tentativa Reset");

    }
}
