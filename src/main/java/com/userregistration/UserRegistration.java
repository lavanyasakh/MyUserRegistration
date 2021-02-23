package com.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    //First Name should start With Capital And Has Min 3 charecters
    public static void firstNameValidity(String name) {
        System.out.println("First Name Validity: " + Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", name));

    }
    //Last Name Should Start With Capital And Has Min 3 Charecters
    public static void lastNameValidity(String name) {
        System.out.println("Last Name Validity: " + Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", name));
    }
    public static void emailValidity(String name) {
        System.out.println("E-Mail Validity: " + Pattern.matches("^[a-zA-Z0-9]{3,}([.]{1}+[a-zA-Z0-9]{3,})*[@]{1}[a-zA-Z0-9]{2,}[.]{1}[a-zA-Z0-9]{2,}([.]{1}[a-zA-Z0-9]{2,})*$", name));
    }
    public static void main(String[] args) {
        System.out.println("Welcome To User Registration Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First name");
        String firstName = sc.nextLine();
        System.out.println("Enter Your Last name");
        String lastName = sc.nextLine();
        System.out.println("Enter Your Email Id");
        String email = sc.nextLine();
        firstNameValidity(firstName);
        lastNameValidity(lastName);
        emailValidity(email);
    }
}

