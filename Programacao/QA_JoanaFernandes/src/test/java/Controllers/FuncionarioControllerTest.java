package Controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class FuncionarioControllerTest {

    private FuncionarioController funcionarioController;
    private FuncionarioController funcionarioController2;

    @BeforeEach
    public void setUp() throws FileNotFoundException {

        funcionarioController = new FuncionarioController();
        funcionarioController2 = new FuncionarioController();
    }

    /**
     * Teste para testar se o stock aparece correto
     */
    @Test
    public void consultarStockTest() {

//Tremoços 1037
        assertEquals(1192, funcionarioController.consultarStockProduto("Tiramisu"));
//Presunto 1123
        assertEquals(1123, funcionarioController.consultarStockProduto("Presunto"));

        assertNotEquals(20, funcionarioController.consultarStockProduto("Bacalhau"));
        assertNotEquals(5, funcionarioController.consultarStockProduto("Papel Higienico"));

    }

    /**
     * Teste para testar se adiciona venda
     * @throws IOException - excepcao
     */
    @Test
    public void addVendaTest() throws IOException {

        String filepath = "src/test/resources/minimercadoTest.csv";

        funcionarioController2.addVenda("Alimentacao","Tremoços",100,0.99);

        File file = new File(filepath);
        Scanner scanner = new Scanner(file);

        String tipoProduto="";
        String nomeProduto="";
        int quantidadeProduto = 0;
        double precoProduto=0;

        String linha = scanner.nextLine();

        while (scanner.hasNextLine()){

            linha = scanner.nextLine();
            String [] linhaDividida = linha.split(",");

            tipoProduto= linhaDividida[0];
            nomeProduto=linhaDividida[1];
            quantidadeProduto= Integer.parseInt(linhaDividida[2]);
            precoProduto= Double.parseDouble(linhaDividida[3]);



        }


        assertEquals("Alimentacao",tipoProduto);
        assertEquals("Tremoços",nomeProduto);
        assertEquals(100,quantidadeProduto);
        assertEquals(0.99,precoProduto);

        assertNotEquals("Higiene",tipoProduto);
        assertNotEquals("Toalhitas",nomeProduto);
        assertNotEquals(20,quantidadeProduto);
        assertNotEquals(80.99,precoProduto);
    }

}
