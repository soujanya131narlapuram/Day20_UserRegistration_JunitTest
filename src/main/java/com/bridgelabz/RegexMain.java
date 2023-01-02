package com.bridgelabz;

public class RegexMain {
    public static void main(String[] args) {
        Regex.firstNameValidation("Soujanya");
        Regex.firstNameValidation("souju");
        System.out.println();

        Regex.lastNameValidation("Narlapuram");
        Regex.lastNameValidation("kolipaka");
        System.out.println();

        Regex.emailValidation("SOUJANYA131@GMAIL.COM");
        Regex.emailValidation("soujanya131@gmail");
        System.out.println();

        Regex.mobileNumberValidation("91 7382573349");
        Regex.mobileNumberValidation("7382573349");
        System.out.println();

        Regex.passwordValidation("hdhysdhyuwh$1");
        Regex.passwordValidation("gydyug#$bS");

        // 1. Valid Emails
        System.out.println("Valid Emails");
        System.out.println("");
        Regex.emailValidation("abc@yahoo.com");
        Regex.emailValidation("abc-100@yahoo.com");
        Regex.emailValidation("abc.100@yahoo.com");
        Regex.emailValidation("abc111@abc.com");
        Regex.emailValidation("abc-100@abc.net");
        Regex.emailValidation("abc.100@abc.com.au");
        Regex.emailValidation("abc@1.com");
        Regex.emailValidation("abc@gmail.com.com");
        Regex.emailValidation("abc+100@gmail.com");

        // 2. Invalid Emails
        System.out.println("Invalid Emails");
        System.out.println("");
        Regex.emailValidation("abc");
        Regex.emailValidation("abc@.com.my");
        Regex.emailValidation("abc123@gmail.a");
        Regex.emailValidation("abc123@.com");
        Regex.emailValidation("abc123@.com.com");
        Regex.emailValidation(".abc@abc.com");
        Regex.emailValidation("abc()*@gmail.com");
        Regex.emailValidation("abc@%*.com");
        Regex.emailValidation("abc..2002@gmail.com");
        Regex.emailValidation("abc.@gmail.com");
        Regex.emailValidation("abc@abc@abc@gmail.com");
        Regex.emailValidation("abc@gmail.com.1a");
        Regex.emailValidation("abc@gmail.com.aa.au");

    }
}