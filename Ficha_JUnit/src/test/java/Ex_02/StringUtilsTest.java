package Ex_02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    private StringUtils stringUtils;

    @BeforeEach
    public void setUp(){

        stringUtils = new StringUtils();
    }


    @Test
    public void testNull(){

        assertFalse(StringUtils.isPalindrome("catatua"));
        assertFalse(StringUtils.isPalindrome("taylor"));
        assertFalse(StringUtils.isPalindrome("ghost"));
    }

    @Test
    public void testIsPalindrome(){

        assertTrue(StringUtils.isPalindrome("ovo"));
        assertTrue(StringUtils.isPalindrome("ANA"));
        assertTrue(StringUtils.isPalindrome("RELER"));
    }
}
