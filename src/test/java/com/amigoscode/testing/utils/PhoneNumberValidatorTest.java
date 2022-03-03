package com.amigoscode.testing.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhoneNumberValidatorTest {

    private PhoneNumberValidator underTest;
    
    @BeforeEach
    void setUp(){
        underTest = new PhoneNumberValidator();
    }


    @ParameterizedTest
    @CsvSource({"+929876543210,FALSE","+919876543210,TRUE"})
    void itShouldValidatePhoneNumberStart(String phoneNumber,String expected){
        //When
        boolean isValid = underTest.test(phoneNumber);
        //Then
        if (expected.equals("TRUE")){
            assertTrue(isValid);
        }
        else{
            assertFalse(isValid);
        }

    }

    @Test
    @DisplayName("Should fail when phone number length is not 13 +")
    void itShouldValidatePhoneNumberLength(){
        //Given
        String phoneNumber = "+9198765432101";
        //When
        boolean isValid = underTest.test(phoneNumber);
        //Then
        assertFalse(isValid);
    }
    
}
