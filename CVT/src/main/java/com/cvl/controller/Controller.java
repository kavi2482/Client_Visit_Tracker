package com.cvl.controller;

import com.cvl.bean.Associate;
import com.cvl.bean.ClientVisitDetails;
//import com.cvl.service.Service;
import com.cvl.service.CvtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private CvtService service;

   @PostMapping("/login")
    public ResponseEntity<?> home(@RequestBody Associate associate) {
       return service.login(associate);
   }


    @PostMapping("/signup")
    public ResponseEntity<?> addUser(@RequestBody Associate associate){
       service.saveUserDetails();
       return service.saveAssociateDetails(associate);
    }


    @PostMapping("/addclientvisitdetails")
    public ResponseEntity<?> addClientVisitDetails(@RequestBody ArrayList<ClientVisitDetails> client){
       return service.saveClientDetails(client);
    }
}
