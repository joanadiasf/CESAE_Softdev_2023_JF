package Controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

public class ClientControllerTest {

    private ClientController clientController;

    @BeforeEach
    public void setUp() throws FileNotFoundException {

        clientController = new ClientController();
    }

    /**
     * Teste para testar qual o produto mais caro
     */
    @Test
    public void produtoMaisCaroTest() {

//Produtos para Casa	| LGTV OLED 85 Golden Edition	| 40000.99€
        assertEquals(40000.99, clientController.produtoMaisCaro().getPrecoUnitario());
        assertEquals("LGTV OLED 85 Golden Edition", clientController.produtoMaisCaro().getProduto());

        assertNotEquals(1.25, clientController.produtoMaisCaro().getPrecoUnitario());
        assertNotEquals("Tremoços", clientController.produtoMaisCaro().getProduto());

    }

    /**
     * Teste para testar se não são impressos duplicados
     */
    @Test
    public void produtosDisponiveisNoDupsTest() {

        assertEquals(109, clientController.produtosDisponiveisSemDuplicados().size());

        boolean check = false;

        for (int i = 0; i < clientController.produtosDisponiveisSemDuplicados().size(); i++) {

            check = false;

            for (int j = 0; j < clientController.produtosDisponiveisSemDuplicados().size(); j++) {

                if (clientController.produtosDisponiveisSemDuplicados().get(i).getProduto().equals
                        (clientController.produtosDisponiveisSemDuplicados().get(j).getProduto())) {

                    check = true;
                }
            }
        }
        assertTrue(check);

    }

    /**
     * Teste para testar se dá a categoria certa ao fazer pesquisa
     */
    @Test
    public void produtosCategoriaTest() {


        assertEquals(45,clientController.produtosDeCategoria("Alimentacao").size());
        assertEquals(30,clientController.produtosDeCategoria("Higiene").size());

        boolean check = false;

        for (int i=0; i < clientController.produtosDeCategoria("Alimentacao").size();i++){

            check=false;
            if (!clientController.produtosDeCategoria("Alimentacao").get(i).getTipoProduto().equals("Alimentacao")){
                check=true;
            }
        }
        for (int i=0; i < clientController.produtosDeCategoria("Higiene").size();i++){

            check=false;
            if (!clientController.produtosDeCategoria("Higiene").get(i).getTipoProduto().equals("Alimentacao")){
                check=true;
            }
        }

        assertTrue(check);


    }

    /**
     * Teste para testar qual o produto mais barato
     */
    @Test
    public void produtoMaisBarato() {
//Alimentacao	| Pate de Sardinha	| 0.65€

        assertEquals(0.65, clientController.produtoMaisBarato().getPrecoUnitario());
        assertEquals("Alimentacao", clientController.produtoMaisBarato().getTipoProduto());

        assertNotEquals(40000.99, clientController.produtoMaisBarato().getPrecoUnitario());
        assertNotEquals("Produtos para Casa", clientController.produtoMaisBarato().getTipoProduto());


    }
}
