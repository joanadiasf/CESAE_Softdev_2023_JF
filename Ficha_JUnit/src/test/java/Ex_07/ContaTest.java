package Ex_07;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContaTest {

    private Conta conta;
    private Conta conta2;
    private Conta conta3;

    @BeforeEach
    public void setUp() {

        conta = new Conta("123", "Shrek", 200);
        conta2 = new Conta("456", "Dora", 400);
        conta3 = new Conta("789", "Noddy", 1000);

    }

    @Test
    public void testTransferencia() {

        assertTrue(conta3.transferencia(300, conta)); //tem que dar

        assertFalse(conta2.transferencia(450, conta3)); //nao pode dar
    }

    @Test
    public void testLevantar() {

        assertTrue(conta.levantar(50)); //tem que dar
        assertFalse(conta2.levantar(450)); //nao pode dar
    }

    @Test
    public void testDepositar() {

        conta.depositar(300);
        assertEquals(500, conta.getSaldo());
    }

    @Test
    public void testPedirEmprestimo() {

        assertTrue(conta3.pedirEmprestimo(800)); //maximo seria 900
        assertFalse(conta3.pedirEmprestimo(1010));

        assertTrue(conta2.pedirEmprestimo(300)); //maximo seria 360
        assertFalse(conta2.pedirEmprestimo(1010));

    }



}

//pra correr um test de cada vez - settings - gradle - mudar o que diz gradel pra IntelliJ