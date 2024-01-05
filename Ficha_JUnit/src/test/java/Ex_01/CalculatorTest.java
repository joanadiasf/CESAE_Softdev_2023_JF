package Ex_01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd(){

        assertEquals(5,calculator.add(5,0));
        //fazer mais
    }

    @Test
    public void testSubtract(){

        assertEquals(50,calculator.subtract(110,60));
        //fazer mais
    }

    @Test
    public void testMultiply(){

        assertEquals(20,calculator.multiply(10,2));
        //fazer mais
    }

    @Test
    public void testDivide(){

        assertEquals(10,calculator.divide(20,2));
    }

    @Test
    public void testDividePerZero(){

        assertThrows(IllegalArgumentException.class,() -> {
            calculator.divide(0,0);
        });
    }

}
