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

    @Test
    public void testCaseValidateEmail(){
        boolean valid = Regex.emailValidation("souju@gmail.com");
        Assertions.assertEquals(false, valid);

        valid = Regex.emailValidation("koli@123");
        Assertions.assertEquals(false, valid);
    }

    @Test
    public void testCaseValidateMobileNumber(){
        boolean valid = Regex.mobileNumberValidation("91 7382573349");
        Assertions.assertEquals(true, valid);

        valid = Regex.mobileNumberValidation("7894789056890789458");
        Assertions.assertEquals(false, valid);
    }
    @Test
    public void testCaseValidatePassword(){
        boolean valid = Regex.passwordValidation("hdhysdhyuwh$1");
        Assertions.assertEquals(false, valid);

        valid = Regex.passwordValidation("gydyug");
        Assertions.assertEquals(false, valid);
    }

}