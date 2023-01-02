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
        boolean valid = Regex.emailValidation("soujanya@gmail.com");
        Assertions.assertEquals(true, valid);
         valid =Regex.emailValidation("abc@yahoo.com");
        Assertions.assertEquals(true, valid);
         valid =Regex.emailValidation("abc-100@yahoo.com");
        Assertions.assertEquals(true, valid);
         valid =Regex.emailValidation("abc.100@yahoo.com");
        Assertions.assertEquals(true, valid);
         valid =Regex.emailValidation("abc111@abc.com");
        Assertions.assertEquals(true, valid);
         valid =Regex.emailValidation("abc-100@abc.net");
        Assertions.assertEquals(true, valid);
         valid =Regex.emailValidation("abc.100@abc.com.au");
        Assertions.assertEquals(true, valid);
       valid= Regex.emailValidation("abc@1.com");
        Assertions.assertEquals(true, valid);
        valid = Regex.emailValidation("abc@gmail.com.com");
        Assertions.assertEquals(true, valid);
        valid=Regex.emailValidation("abc+100@gmail.com");
        Assertions.assertEquals(true, valid);



        valid = Regex.emailValidation("koli@123");
        Assertions.assertEquals(false, valid);
        valid = Regex.emailValidation("abc");
        Assertions.assertEquals(false, valid);
//        valid = Regex.emailValidation("abc@.com.my");
//        Assertions.assertEquals(false, valid);
        valid = Regex.emailValidation("abc123@gmail.a");
        Assertions.assertEquals(false, valid);
        valid = Regex.emailValidation("abc123@.com");
        Assertions.assertEquals(false, valid);
//        valid = Regex.emailValidation("abc123@.com.com");
//        Assertions.assertEquals(false, valid);
//        valid =  Regex.emailValidation(".abc@abc.com");
//        Assertions.assertEquals(false, valid);
        valid = Regex.emailValidation("abc()*@gmail.com");
        Assertions.assertEquals(false, valid);
        valid = Regex.emailValidation("abc@%*.com");
        Assertions.assertEquals(false, valid);
//        valid = Regex.emailValidation("abc..2002@gmail.com");
//        Assertions.assertEquals(false, valid);
//        valid =  Regex.emailValidation("abc.@gmail.com");
//        Assertions.assertEquals(false, valid);
        valid = Regex.emailValidation("abc@abc@abc@gmail.com");
        Assertions.assertEquals(false, valid);
        valid =  Regex.emailValidation("abc@gmail.com.1a");
        Assertions.assertEquals(false, valid);
//        valid = Regex.emailValidation("abc@gmail.com.aa.au");
//        Assertions.assertEquals(false, valid);
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
        boolean valid = Regex.passwordValidation("$abcde1hg");
        Assertions.assertEquals(false, valid);

        valid = Regex.passwordValidation("aBcdefgh");
        Assertions.assertEquals(false, valid);
    }

    @Test
    public void happyTestCases() {
        boolean valid = Regex.firstNameValidation("Soujanya");
        Assertions.assertEquals(true, valid);
        valid = Regex.lastNameValidation("Narlapuram");
        Assertions.assertEquals(true, valid);
        valid = Regex.emailValidation("soujanya@gmail.com");
        Assertions.assertEquals(true, valid);
        valid = Regex.mobileNumberValidation("91 7382573349");
        Assertions.assertEquals(true, valid);
        valid = Regex.passwordValidation("Acdeg1hg");
        Assertions.assertEquals(true, valid);

    }
    @Test
    public void sadTestCases() {

        boolean   valid = Regex.firstNameValidation("1234");
        Assertions.assertEquals(false, valid);
        valid = Regex.passwordValidation("cdefgh");
        Assertions.assertEquals(false, valid);
        valid = Regex.emailValidation("abc@abc@abc@gmail.com");
        Assertions.assertEquals(false, valid);
        valid = Regex.mobileNumberValidation("7894789056890789458");
        Assertions.assertEquals(false, valid);
        valid = Regex.lastNameValidation("Kolipaka");
        Assertions.assertEquals(true, valid);

    }


}