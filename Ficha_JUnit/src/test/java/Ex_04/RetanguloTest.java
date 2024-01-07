package Ex_04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class RetanguloTest {

    private Retangulo retangulo;

    @BeforeEach
    public void setUp(){
        retangulo=new Retangulo(10,5);
    }

    @Test
    public void testPerimetro(){

        assertEquals(30,retangulo.calcularPerimetro());
    }

    @Test
    public void testArea(){

        assertEquals(50,retangulo.calcularArea());
    }
}
