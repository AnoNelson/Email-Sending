package com.testemail.demo.controller;

import com.testemail.demo.DTO.EmailObject;
import com.testemail.demo.service.ControllerFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/sendEmail")
public class SendEmailRestController {
    @Autowired
    private ControllerFunction controllerFunction;
    @PostMapping("")
    public ResponseEntity<?> sendEmail(@RequestBody EmailObject emailObject ) throws Exception {
      if(emailObject.getEmail()!=null && emailObject.getEmail()!=null){

          return new ResponseEntity<Object>( controllerFunction.sendEmail(emailObject), HttpStatus.OK);
      }
      return null;
    }
    @GetMapping("")
    public String test(){
        return "endpoint working ";
    }

}
