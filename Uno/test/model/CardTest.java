package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michel
 */
public class CardTest {

    /**
     * Test of getColor method, of class Card.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Card instance = null;
        Color expResult = null;
        Color result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class Card.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Card instance = null;
        int expResult = 0;
        int result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sameColor method, of class Card.
     */
    @Test
    public void testSameColor() {
        System.out.println("sameColor");
        Card card = null;
        Card instance = null;
        boolean expResult = false;
        boolean result = instance.sameColor(card);
        assertEquals(expResult, result);
    }

    /**
     * Test of sameValue method, of class Card.
     */
    @Test
    public void testSameValue() {
        System.out.println("sameValue");
        Card card = null;
        Card instance = null;
        boolean expResult = false;
        boolean result = instance.sameValue(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
