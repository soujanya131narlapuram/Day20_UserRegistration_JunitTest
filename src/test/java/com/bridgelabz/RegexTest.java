package com.bridgelabz;
import org.junit.jupiter.api.*;
import org.junit.Test;

public class RegexTest {
    @Test
    public void testCaseValidateFirstName(){
        boolean valid = Regex.firstNameValidation("soujanya");
        Assertions.assertEquals(false, valid);

        valid = Regex.firstNameValidation("Ashok");
        Assertions.assertEquals(true, valid);

        valid = Regex.firstNameValidation("1234");
        Assertions.assertEquals(false, valid);

    }
    @Test
    public void testCaseValidateLastName(){
        boolean valid = Regex.lastNameValidation("narlapuram");
        Assertions.assertEquals(false, valid);

        valid = Regex.lastNameValidation("Kolipaka");
        Assertions.assertEquals(true, valid);
    }



}