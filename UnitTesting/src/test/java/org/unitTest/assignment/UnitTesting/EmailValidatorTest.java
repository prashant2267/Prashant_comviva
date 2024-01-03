package org.unitTest.assignment.UnitTesting;
import org.unitTest.assignment.UnitTesting.EmailValidator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EmailValidatorTest {

    @Test
    public void testIsValidEmail() {
        EmailValidator validator = new EmailValidator();

        // Test case: Valid email
        assertTrue(validator.isValidEmail("user@example.com"));

        // Test case: Invalid email
        assertFalse(validator.isValidEmail("invalid_email"));

        // Test case: Valid email with a complex pattern
        assertTrue(validator.isValidEmail("john.doe123@company.net"));

        // Test case: Null email
        assertFalse(validator.isValidEmail(null));
    }

    @Test
    public void testIsCorporateEmail() {
        EmailValidator validator = new EmailValidator();

        // Test case: Corporate email
        assertTrue(validator.isCorporateEmail("employee@company.com"));

        // Test case: Non-corporate email
        assertFalse(validator.isCorporateEmail("user@example.com"));

        // Test case: Null email
        assertFalse(validator.isCorporateEmail(null));

        // Test case: Corporate email with different casing
        assertTrue(validator.isCorporateEmail("john.doe@Company.com"));
    }
}
