package com.volacode.controller;


import com.volacode.exceptions.VolaBankException;
import com.volacode.models.Customer;
import com.volacode.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class LoginController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody Customer customer){
        Customer savedCustomer =null ;
        ResponseEntity response = null;
        try {
//            List<Customer> foundCustomer =customerRepository.findByEmail(customer.getEmail());
//            if (foundCustomer.contains(savedCustomer))throw new VolaBankException(
//                String.format("Username %s has already been used", customer.getEmail()));


            savedCustomer = customerRepository.save(customer);
            if(savedCustomer.getId() > 0){
            response = ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body("Given user details are successfully registered");
            }

        }catch (Exception ex){
            response = ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An exception occurred due to " + ex.getMessage());
        }
        return response;

    }
}
