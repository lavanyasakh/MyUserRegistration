package com.userregistration;
import java.util.Scanner;
import java.util.regex.Pattern;
@FunctionalInterface
interface UserEntryDetails {
    boolean validityCheck(String pattern, String name);
}


public class UserRegistration {
    static String FIRST_NAME = "^[A-Z]{1}[a-zA-Z]{2,}$";
    static String LAST_NAME = "^[A-Z]{1}[a-zA-Z]{2,}$";
    static String EMAIL = "^[a-zA-Z0-9]{3,}([\\.\\+\\-]?[a-zA-Z0-9]{3,})?[@][A-Za-z0-9]{1,}[.][A-Za-z]{2,4}[,]?([.][A-Za-z]{2,4}[.]?)?$";
    static String MOBILE_NUMBER = "^[9][1]\\s[6-9][0-9]{9}$";
    static String PASSWORD = "^(?=.*[\\@\\#\\$\\%\\&\\_\\,\\.])(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z]).{8,}$";
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        UserEntryDetails compare = (String pattern, String name) -> Pattern.matches(pattern, name);
        System.out.println("Enter your First Name");
        String firstName = sc.next();
        System.out.println("Enter your Last Name");
        String lastName = sc.next();
        System.out.println("Enter your email");
        String email = sc.next();
        System.out.println("Enter your Mobile Number");
        String mobile = sc.next();
        System.out.println("Enter Password");
        String password = sc.next();

        System.out.println("Entered First Name is " + compare.validityCheck(FIRST_NAME, firstName));
        System.out.println("Entered Last Name is " + compare.validityCheck(LAST_NAME, lastName));
        System.out.println("Entered Email is " + compare.validityCheck(EMAIL, email));
        System.out.println("Entered Mobile Number is " + compare.validityCheck(MOBILE_NUMBER, mobile));
        System.out.println("Entered Password is " + compare.validityCheck(PASSWORD, password));
    }
}

