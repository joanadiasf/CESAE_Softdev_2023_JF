package Ex_06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarroTest {

    private Carro carro;
    private Carro carroAdversario;

    @BeforeEach
    public void setUp() {

        carro = new Carro("Fiat","500",2003,200,50,TipoCombustivel.GASOLINA,5);
        carroAdversario = new Carro("Mercedes","Benz",2000,100,40,TipoCombustivel.GASOLINA,5);
    }

    @Test
    public void testCorrida(){

        //o carro "fiat" tem que ganhar
        assertEquals(carro,carro.corrida(carroAdversario));

    }

    @Test
    public void testCalcularConsumo(){ //2.5 = (5 consumo/100) * 50 distancia

        assertEquals(2.5,carro.calcularConsumo(50));
    }
}
