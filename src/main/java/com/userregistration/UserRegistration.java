package com.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    //First Name should start With Capital And Has Min 3 charecters
    public boolean firstNameValidity(String name) throws UserRegistrationException {
        if (Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", name))
            return true;
        else
            throw new UserRegistrationException("Invalid First Name");
    }
    //Last Name Should Start With Capital And Has Min 3 Charecters
    public boolean lastNameValidity(String name) throws UserRegistrationException {
        if(Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", name))
            return true;
        else
            throw new UserRegistrationException("Invalid Last Name");

    }
    public boolean emailValidity(String name) throws UserRegistrationException {
        if(Pattern.matches("^[a-z]{3,}([\\.\\+\\-]?[0-9]{3,})?[@][a-z0-9]{1,}[.][a-z]{2,4}[,]?([.][a-z]{2,4}[.]?)?$", name))
            return true;
        else
            throw new UserRegistrationException("Invalid email Id");
    }
    //Country Code Followed by Space And Fallowed By 10 Digit Numbers
    public boolean mobileValidity(String name) throws UserRegistrationException {
        if(Pattern.matches("^[9][1][\s][6-9][0-9]{9}$", name))
            return true;
        else
            throw new UserRegistrationException("Invalid Mobile Number");
    }
    //should Have Min 8 Charecters And Should Have Atleast One UpperCase And Should Have One Numeric Value And One Special Charecter
    public boolean passwordValidity(String name) throws UserRegistrationException {
        if(Pattern.matches("^(?=.*[\\@\\#\\$\\%\\&\\_\\,\\.])(?=.*[A-Z])(?=.*[0-9]).{8,}$", name))
            return true;
        else
            throw new UserRegistrationException("Invalid Password");
    }
    public static void main(String[] args) {
        System.out.println("Welcome To User Registration Program");
        UserRegistration person = new UserRegistration();
        try {
            person.firstNameValidity("Lavanya");
        }catch(Exception e) {System.out.println("Exception occured is " + e);}
        try {
            person.lastNameValidity("Sakhamuri");
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
        try {
            person.emailValidity("lavanyace929@gmail.com" );
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
        try {
            person.mobileValidity("91 9963929045");
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
        try {
            person.passwordValidity("Hieveryone@3");
        }catch(Exception e) {
            System.out.println("Exception occured is " + e);
        }
    }
}

