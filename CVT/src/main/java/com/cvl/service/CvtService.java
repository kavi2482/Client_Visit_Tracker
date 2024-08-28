package com.cvl.service;

import com.cvl.bean.Associate;
import com.cvl.bean.ClientVisitDetails;
import com.cvl.bean.UserDetails;
import com.cvl.repo.AssociateRepo;
import com.cvl.repo.ClientVisitDetailsRepository;
import com.cvl.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Optional;
@org.springframework.stereotype.Service
public class CvtService {

    @Autowired
   private AssociateRepo associateRepo;
    @Autowired
    private ClientVisitDetailsRepository clientVisitRepo;
    @Autowired
    private UserRepo userRepo;

    /*
      The method is used to insert/update associate details;
     */
    public ResponseEntity<?> saveAssociateDetails(Associate associate){
        try {

            Optional<UserDetails> userOptional = userRepo.findById(associate.getEmpId());
            Optional<Associate> associateOptional = associateRepo.findById(associate.getEmpId());

            if(associateOptional.isEmpty()) {
                if (!userOptional.isEmpty()) {
                    UserDetails user = userOptional.get();
                    associateRepo.save(associate);
                    return new ResponseEntity<>(associate.getEmpId() + " account created successfully!!", HttpStatus.CREATED);
                } else {
                    return new ResponseEntity<>(associate.getEmpId() + " not part of IAG", HttpStatus.BAD_REQUEST);
                }
            }
            else{
                return new ResponseEntity<>("account already exists", HttpStatus.BAD_REQUEST);
            }
        } catch (Exception e){
            Optional<UserDetails> userOptional = userRepo.findById(associate.getEmpId());

                if (!userOptional.isEmpty()) {
                    UserDetails user = userOptional.get();
                    associateRepo.save(associate);
                    return new ResponseEntity<>(associate.getEmpId() + " account created successfully!!", HttpStatus.CREATED);
                } else {
                    return new ResponseEntity<>(associate.getEmpId() + " not part of IAG", HttpStatus.BAD_REQUEST);
                }
        }
    }

   public void saveUserDetails(){
      UserDetails user1 = new UserDetails(1898184,"Darshini Karthiekeyan","1898184@tcs.com","Java Developer");
      UserDetails user2 = new UserDetails(2563266,"Bharathraj M","2563266@tcs.com","Developer");
      UserDetails user3 = new UserDetails(1793190,"Ranjith Varatharajan","1793190@tcs.com","Developer");
      UserDetails user4 = new UserDetails(2315502,"Kaviraj A","2315502@tcs.com","AWS Developer");
      UserDetails user5 = new UserDetails(345125,"Rajarajeshwari Yuvaraj","345125@tcs.com","Project Manager");
       userRepo.save(user1);
       userRepo.save(user2);
       userRepo.save(user3);
       userRepo.save(user4);
       userRepo.save(user5);
   }

    public ResponseEntity<?> login(Associate associate){
        try {
            Optional<Associate> associateOptional = associateRepo.findById(associate.getEmpId());
            Associate fetchAssociate = associateOptional.get();
            if (associateOptional.isEmpty()) {
                return new ResponseEntity<>(associate.getEmpId() + " account didn't exists!!. Please,SignUp", HttpStatus.BAD_REQUEST);
            } else {
                if ((associate.getEmpId() == fetchAssociate.getEmpId()) && (associate.getPassword().equals(fetchAssociate.getPassword()))) {
                    return new ResponseEntity<>(associate.getEmpId() + " successfully login!!", HttpStatus.OK);
                } else {
                    return new ResponseEntity<>(associate.getEmpId() + " invalid credentials!!", HttpStatus.BAD_REQUEST);
                }
            }
        }catch(Exception e){
            return new ResponseEntity<>(associate.getEmpId()+" account didn't exists!!. Please,SignUp",HttpStatus.BAD_REQUEST);
            }
    }



    /*
       This method is used to insert/update Client visit Details
     */
    public ResponseEntity<?> saveClientDetails(ArrayList<ClientVisitDetails> client){
        String message = "";
       try{
           for (ClientVisitDetails cvd : client) {
               Optional<ClientVisitDetails> cvdOptional = clientVisitRepo.findById(cvd.getName());
               ClientVisitDetails client1 = cvdOptional.get();
               clientVisitRepo.save(cvd);
           }
            return new ResponseEntity<>("Client Visit details added successfully",HttpStatus.CREATED);
        } catch (NoSuchElementException e){
           for (ClientVisitDetails clientVisitDetails : client) {
               clientVisitRepo.save(clientVisitDetails);
           }
           return new ResponseEntity<>("Clent Visit details added successfully",HttpStatus.CREATED);
       }
       catch(Exception e){
            return new ResponseEntity<>("error1: Server Error. Failed to add client visit details",HttpStatus.BAD_REQUEST);
        }
    }
}

