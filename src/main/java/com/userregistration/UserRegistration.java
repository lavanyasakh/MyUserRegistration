package com.userregistration;


import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    //First Name should start With Capital And Has Min 3 charecters
    public boolean firstNameValidity(String name) {
        return Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", name);

    }
    //Last Name Should Start With Capital And Has Min 3 Charecters
    public boolean lastNameValidity(String name) {
        return Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", name);
    }
    public boolean emailValidity(String name) {
        return Pattern.matches("^[a-z]{3,}([\\.\\+\\-]?[0-9]{3,})?[@][a-z0-9]{1,}[.][a-z]{2,4}[,]?([.][a-z]{2,4}[.]?)?$", name);
    }
    //Country Code Followed by Space And Fallowed By 10 Digit Numbers
    public boolean mobileValidity(String name) {
        return Pattern.matches("^[9][1][\s][6-9][0-9]{9}$", name);
    }
    //should Have Min 8 Charecters And Should Have Atleast One UpperCase And Should Have One Numeric Value And One Special Charecter
    public boolean passwordValidity(String name) {
        return Pattern.matches("^(?=.*[\\@\\#\\$\\%\\&\\_\\,\\.])(?=.*[A-Z])(?=.*[0-9]).{8,}$", name);
    }
    public static void main(String[] args) {
        System.out.println("Welcome To User Registration Program");
        UserRegistration person = new UserRegistration();
        System.out.println(person.firstNameValidity("Lavanya"));
        System.out.println(person.lastNameValidity("Sakhamuri"));
        System.out.println(person.emailValidity("lavanyace929@gmail.com"));
        System.out.println(person.mobileValidity("91 9963926754"));
        System.out.println(person.passwordValidity("Hieveryone@3"));
    }
}

