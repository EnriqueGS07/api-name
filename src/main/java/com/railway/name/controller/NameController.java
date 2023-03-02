package com.railway.name.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/name")
public class NameController {
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getFunction(){
        return new ResponseEntity<>("Enrique", HttpStatus.OK);
    }
}
