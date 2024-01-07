package Ex_05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuncionarioTest {

    private Funcionario funcionario;

    @BeforeEach
    public void setUp(){

        funcionario=new Funcionario("Zezinho",850.0,"Vendas");
    }

    @Test
    public void testSalario(){

        assertEquals(1275.0,funcionario.aumentarSalario(50.0));
    }

    @Test
    public void testExibirDetalhes(){

        String textoEsperado= "Nome: Zezinho\nSalario: 850.0\nDepartamento: Vendas";

       assertEquals(textoEsperado,funcionario.exibirDetalhes());
    }
}
