package Ex_03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {

    private Animal animal;
    private Animal animal2;

    @BeforeEach
    public void setUp(){
        animal = new Animal("Tobias",true,Alimento.CARNE);
        animal2 = new Animal("Dwight",true,Alimento.FRUTAS);
    }

    @Test
    public void getNome(){

        assertEquals("Tobias",animal.getNome());
        assertEquals("Dwight",animal2.getNome());
    }

    @Test
    public void testComerCarne(){

        Alimento comida = Alimento.CARNE;
        animal.comer(comida);

        assertFalse(animal.estaComFome());

        animal2.comer(comida);

        assertTrue(animal2.estaComFome());
    }

    @Test
    public void testComerFruta(){

        Alimento comida = Alimento.FRUTAS;
        animal.comer(comida);

        assertTrue(animal.estaComFome());

        animal2.comer(comida);

        assertFalse(animal2.estaComFome());
    }

    @Test
    public void testComerPeixe(){

        Alimento comida = Alimento.PEIXE;
        animal.comer(comida);

        assertTrue(animal.estaComFome());

        animal2.comer(comida);

        assertTrue(animal2.estaComFome());
    }

    @Test
    public void testComerVegetais(){

        Alimento comida = Alimento.VEGETAIS;
        animal.comer(comida);

        assertTrue(animal.estaComFome());

        animal2.comer(comida);

        assertTrue(animal2.estaComFome());
    }
}
