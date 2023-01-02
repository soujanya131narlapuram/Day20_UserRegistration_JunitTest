package com.bridgelabz;
import org.junit.jupiter.api.*;
import org.junit.Test;

public class RegexTest {
    @Test
    public void testValidateFirstName(){
        boolean valid = Regex.firstNameValidation("soujanya");
        Assertions.assertEquals(false, valid);

        valid = Regex.firstNameValidation("Ashok");
        Assertions.assertEquals(true, valid);
    }
}