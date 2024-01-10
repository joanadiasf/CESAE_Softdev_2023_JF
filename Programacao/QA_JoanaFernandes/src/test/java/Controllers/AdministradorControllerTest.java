package Controllers;

import Domain.Venda;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdministradorControllerTest {

    private AdministradorController administradorController;
    private Venda venda;
    @BeforeEach
    public void setUp() throws FileNotFoundException {

        administradorController= new AdministradorController();
        venda = new Venda("Alimentacao","Cerveja Super Bock",1111.0,0.99);
    }

    @Test
    public void produtoMaisVendidoTest(){

//O produto mais vendido vendeu 1111.0 unidades: Alimentacao	| Cerveja Super Bock	| 0.99€

        assertEquals(venda,administradorController.produtoMaisVendido());
    }
}
