package org.example;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
public class StringProcessorTest extends TestCase {
    @Test
    public void testIsStrongPassword() {
        StringProcessor string = new StringProcessor();
        assertFalse(string.isStrongPassword("amira"));
        assertTrue(string.isStrongPassword("Amira1@"));
        assertFalse(string.isStrongPassword("apple"));
        assertTrue(string.isStrongPassword("Short#7"));
        assertFalse(string.isStrongPassword("123"));

    }
    @Test
    public void testCalculateDigits() {
        StringProcessor string = new StringProcessor();
        assertEquals(2, string.calculateDigits("89"));
        assertEquals(5, string.calculateDigits("34567"));
        assertEquals(0, string.calculateDigits("apple"));
        assertEquals(3, string.calculateDigits("123"));
        assertEquals(4, string.calculateDigits("2005"));
    }
    @Test
    public void testCalculateWords() {
        StringProcessor string = new StringProcessor();
        assertEquals(0, string.calculateWords("05"));
        assertEquals(1, string.calculateWords("hello "));
        assertEquals(2, string.calculateWords("hello world "));
        assertEquals(3, string.calculateWords("write three words"));
        assertEquals(4, string.calculateWords("My name is Amira"));
    }
    @Test
    public void testCalculateExpression() {
        StringProcessor string = new StringProcessor();
        assertEquals(6.0, string.calculateExpression("5 + 1"));
        assertEquals(0.0, string.calculateExpression("5 - (2+ 3)"));
        assertEquals(100.0, string.calculateExpression("20 * (4 + 1)"));
        assertEquals(-1.0, string.calculateExpression("5 - 6"));
        assertEquals(4.0, string.calculateExpression("16 / 4"));
    }
}