package org.userregistration;

import com.userregistration.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import javax.xml.xpath.XPathEvaluationResult;



public class UserRegistrationTest {
    @Test
    public void checkGivenFirstNameIsValid() { //Given First Name is valid or not
        UserRegistration person = new UserRegistration();
         Assertions.assertEquals(true, person.firstNameValidity("Lavanya"));
    }
    @Test
    public void checkGivenFirstNameIsNotValid_DoesNotStartWithCapital() {
        //If the given First Name does not start with Capital
        UserRegistration person = new UserRegistration();
        Assertions.assertEquals(false,person.firstNameValidity("lavanya"));
    }
    @Test
    public void checkGivenFirstNameIsNotValid_includesNumeric() {
        //If the given First Name does not start with Capital
        UserRegistration person = new UserRegistration();
        Assertions.assertEquals(false, person.firstNameValidity("Lavanya36"));
    }
    @Test
    public void checkGivenFirstNameIsNotValid_lessThan3Characters() {
        //If the given First Name does not start with Capital
        UserRegistration person = new UserRegistration();
        Assertions.assertEquals(false, person.firstNameValidity("la"));
    }
    @Test
    public void checkGivenLastNameIsValid() {
        UserRegistration person = new UserRegistration();
        Assertions.assertEquals(true, person.lastNameValidity("Sakhamuri"));
    }
    @Test
    public void checkGivenLastNameIsNotValid_DoesNotStartWithCapital() {
        //If the given Last Name does not start with Capital
        UserRegistration person = new UserRegistration();
        Assertions.assertEquals(false, person.lastNameValidity("sakhamuri"));
    }
    @Test
    public void checkGivenLastNameIsNotValid_includesNumeric() {
        //If the given Last Name does not start with Capital
        UserRegistration person = new UserRegistration();
        Assertions.assertEquals(false,person.lastNameValidity("Sakha67"));
    }
    @Test
    public void checkGivenLastNameIsNotValid_lessThan3Characters() {
        //If the given Last Name does not start with Capital
        UserRegistration person = new UserRegistration();
        Assertions.assertEquals(false,person.lastNameValidity("Sa"));
    }
    @Test
    public void checkGivenEmailIsValid() {
        UserRegistration person = new UserRegistration();
        Assertions.assertEquals(true,person.emailValidity("lavanyace929@gmail.com"));
    }
    @Test
    public void checkGivenEmailNotValid() {
        UserRegistration person = new UserRegistration();
        Assertions.assertEquals(false,person.emailValidity("lavanyace...929@gmail"));
    }
    @Test
    public void checkGivenPhoneNumberIsValid() {
        UserRegistration person = new UserRegistration();
        Assertions.assertEquals(false,person.mobileValidity("91 9963929032"));
    }
    @Test
    public void checkGivenPhoneNumberNotValid_withoutSpace() {
        UserRegistration person = new UserRegistration();
        Assertions.assertEquals(false,person.mobileValidity("919963452390"));
    }
    @Test
    public void checkGivenPhoneNumberNotValid_withoutLessThan10Digits() {
        UserRegistration person = new UserRegistration();
        Assertions.assertEquals(false,person.mobileValidity("91 99639290"));
    }
    @Test
    public void checkGivenPhoneNumberNotValid_withoutMoreThan10Digits() {
        UserRegistration person = new UserRegistration();
        boolean check = person.mobileValidity("91 996392904523");
        Assertions.assertTrue(check);
    }
    @Test
    public void checkGivenPhoneNumberNotValid_countryCodelessThan2Digits() {
        UserRegistration person = new UserRegistration();
        Assertions.assertEquals(false,person.mobileValidity("9 9963929032"));
    }
    @Test
    public void checkGivenPasswordIsValid() {
        UserRegistration person = new UserRegistration();
        Assertions.assertEquals(true,person.passwordValidity("Helloall@4"));
    }
    @Test
    public void checkGivenPasswordNotValid_LessThan8Characters() {
        UserRegistration person = new UserRegistration();
        Assertions.assertEquals(false,person.passwordValidity("Hello"));
    }
    @Test
    public void checkGivenPasswordNotValid_Atleast1orMoreCapitalLetter() {
        UserRegistration person = new UserRegistration();
        Assertions.assertEquals(false,person.passwordValidity("helloall@3"));
    }
    @Test
    public void checkGivenPasswordNotValid_Atleast1OrMoreNumeric() {
        UserRegistration person = new UserRegistration();
        Assertions.assertEquals(false,person.passwordValidity("Helloall@"));
    }
    @Test
    public void checkGivenPasswordNotValid_Only1SpecialCharacter() {
        UserRegistration person = new UserRegistration();
        Assertions.assertEquals(false,person.passwordValidity("Hello@#123"));
    }
}

