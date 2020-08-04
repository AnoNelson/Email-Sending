package com.testemail.demo.service;


import com.testemail.demo.DTO.EmailObject;
import com.testemail.demo.exceptions.GlobalException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ControllerFunction {

    @Autowired
    private EmailProvider emailProvider;

    public  String sendEmail(EmailObject emailObject) throws Exception {
         String message = emailProvider.sendEmail(emailObject.getEmail(),"checking Cc function",emailObject.getcC());
        if(message.equals("email sent")) {
            return "email successfully sent";
        }else{
            throw new GlobalException(message);
        }

    }
}
