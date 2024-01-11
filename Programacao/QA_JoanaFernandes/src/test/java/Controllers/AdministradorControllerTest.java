package Controllers;



import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class AdministradorControllerTest {

    private AdministradorController administradorController;

    @BeforeEach
    public void setUp() throws FileNotFoundException {

        administradorController= new AdministradorController("src/test/resources/minimercadoTest.csv");
    }

    /**
     * Teste para testar qual o produto mais vendido
     */
    @Test
    public void produtoMaisVendidoTest(){

//O produto mais vendido vendeu 1111.0 unidades: Alimentacao	| Cerveja Super Bock	| 0.99€

        assertEquals(1111.0, administradorController.produtoMaisVendido().getQuantidadeVendida());
        assertEquals("Cerveja Super Bock", administradorController.produtoMaisVendido().getProduto());

        assertNotEquals(8.0,administradorController.produtoMaisVendido().getQuantidadeVendida());
        assertNotEquals("Condicionador",administradorController.produtoMaisVendido().getProduto());
    }

    @Test
    public void produtoQueMaisVendeuTest(){
//Vendeu 445.0 Alimentacao	| Cerveja Super Bock	| 0.99€

        assertEquals("Cerveja Super Bock",administradorController.produtoQueMaisVendeu().getProduto());
        assertEquals(445,administradorController.produtoQueMaisVendeu().getQuantidadeVendida());

        assertNotEquals("Atum de Sereia",administradorController.produtoQueMaisVendeu().getProduto());
        assertNotEquals(42,administradorController.produtoQueMaisVendeu().getQuantidadeVendida());

    }

    /**
     * Teste para testar qual a venda de maior valor
     */
    @Test
    public void vendaMaisValorTest(){

        //Produtos para Casa	| LGTV OLED 85 Golden Edition	| 40000.99€

        assertEquals(40000.99,administradorController.vendaMaisValor().getPrecoUnitario());
        assertEquals("LGTV OLED 85 Golden Edition",administradorController.vendaMaisValor().getProduto());

        assertNotEquals(1.25, administradorController.vendaMaisValor().getPrecoUnitario());
        assertNotEquals("Tremoços",administradorController.vendaMaisValor().getProduto());
    }

    /**
     * Teste para testar qual o valor total das vendas
     */
    @Test
    public void valorVendasTest(){

        //56095.609999999964 €

        assertEquals(56095.609999999964,administradorController.valorVendas());
        assertNotEquals(10,administradorController.valorVendas());
    }

    /**
     * Teste para testar o valor médio das vendas
     */
    @Test
    public void mediaVendasTest(){

        //421.77150375939823 €

        assertEquals(421.77150375939823,administradorController.mediaVendas());
        assertNotEquals(420,administradorController.mediaVendas());
    }

    @Test
    public void addUtilizadorTest() throws IOException {

        String filepath = "src/test/resources/login_grandesNegociosTest.csv";

        administradorController.adicionarUtilizador("ADMIN","tobias","softdev","src/test/resources/login_grandesNegociosTest.csv");

        File file = new File(filepath);
        Scanner scanner = new Scanner(file);

        String tipoUtilizador="";
        String username="";
        String passeword="";

        String linha = scanner.nextLine();
        while (scanner.hasNextLine()){

            linha = scanner.nextLine();
            String [] linhaDividida = linha.split(";");

            tipoUtilizador= linhaDividida[0];
            username=linhaDividida[1];
            passeword= linhaDividida[2];

        }

        assertEquals("ADMIN", tipoUtilizador);
        assertEquals("tobias", username);
        assertEquals("softdev",passeword);


    }

    @Test
    public void addUtilizadorInvalidoTest() throws IOException {

        String filepath = "resources/login_grandesNegociosTest.csv";


        assertThrows(IllegalArgumentException.class, () ->{
                    administradorController.adicionarUtilizador("SEGURANCA","Nick","999","resources/login_grandesNegociosTest.csv");

        });

        assertThrows(IllegalArgumentException.class, () ->{
            administradorController.adicionarUtilizador("ADMINISTRADOR","MichaelScott","hateOnToby","resources/login_grandesNegociosTest.csv");

        });


    }


}
