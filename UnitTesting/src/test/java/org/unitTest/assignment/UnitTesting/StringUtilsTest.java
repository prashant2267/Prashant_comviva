package org.unitTest.assignment.UnitTesting;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.unitTest.assignment.UnitTesting.StringUtils;

import org.junit.Test;
public class StringUtilsTest {

    @Test
    public void testReverse() {
        StringUtils utils = new StringUtils();

        // Test case: Reverse a non-empty string
        assertEquals("olleh", utils.reverse("hello"));

        // Test case: Reverse an empty string
        assertEquals("", utils.reverse(""));

        // Test case: Reverse a string with spaces
        assertEquals(" dcba", utils.reverse("abcd "));
    }

    @Test
    public void testIsPalindrome() {
        StringUtils utils = new StringUtils();

        // Test case: Palindrome string
        assertTrue(utils.isPalindrome("radar"));

        // Test case: Non-palindrome string
        assertFalse(utils.isPalindrome("hello"));

        // Test case: Palindrome with spaces
        assertTrue(utils.isPalindrome("a man a plan a canal panama"));
    }

    @Test
    public void testConcatenate() {
        StringUtils utils = new StringUtils();

        // Test case: Concatenate non-empty strings
        assertEquals("HelloWorld", utils.concatenate("Hello", "World"));

        // Test case: Concatenate with an empty string
        assertEquals("Hello", utils.concatenate("Hello", ""));

        // Test case: Concatenate two empty strings
        assertEquals("", utils.concatenate("", ""));
    }

    @Test
    public void testCountOccurrences() {
        StringUtils utils = new StringUtils();

        // Test case: Count occurrences of a character in a non-empty string
        assertEquals(2, utils.countOccurrences("hello", 'l'));

        // Test case: Count occurrences of a character in an empty string
        assertEquals(0, utils.countOccurrences("", 'a'));

        // Test case: Count occurrences of a character not present in the string
        assertEquals(0, utils.countOccurrences("world", 'a'));
    }

    @Test
    public void testCountOccurrencesWithSpecialCharacter() {
        StringUtils utils = new StringUtils();

        // Test case: Count occurrences of a special character
        assertEquals(3, utils.countOccurrences("abc$def$ghi$jkl", '$'));
    }
}