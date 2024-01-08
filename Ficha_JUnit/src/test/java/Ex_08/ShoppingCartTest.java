package Ex_08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {

    private ShoppingCart shoppingCart;

    @BeforeEach
    public void setUp(){

        shoppingCart = new ShoppingCart("007");

        shoppingCart.addItem("Piada");
        shoppingCart.addItem("Piadinha");
        shoppingCart.addItem("Gargalhada");
    }

    @Test
    public void addItemTest(){

        shoppingCart.addItem("Risada");

        assertTrue(shoppingCart.containsItem("Risada"));

    }

    @Test
    public void removeItemTest(){

        shoppingCart.removeItem("Piada");

        assertFalse(shoppingCart.containsItem("Piada"));
    }

    @Test
    public void getItemTest(){

        assertEquals(3,shoppingCart.getItemCount());
    }

    @Test
    public void clearCartTest(){

        shoppingCart.clearCart();

        assertFalse(shoppingCart.containsItem("Piadinha"));
    }
}
