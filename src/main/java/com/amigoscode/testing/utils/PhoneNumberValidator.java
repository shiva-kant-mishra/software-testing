package com.amigoscode.testing.utils;

import org.springframework.stereotype.Service;

@Service
public class PhoneNumberValidator {
    
    
    public boolean test(String phoneNumber){
        if (phoneNumber.startsWith("+91") && phoneNumber.length()==13){
            return true;
        }
        else{
            return false;
        }
            
    }
}
