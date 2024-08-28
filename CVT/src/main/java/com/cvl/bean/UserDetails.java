package com.cvl.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserDetails {
    @Id
    private int empId;
    private String name;
    private String emailId;
    private String role;

    public UserDetails() {
    }

    public UserDetails(int empId, String name, String emailId, String role) {
        this.empId = empId;
        this.name = name;
        this.emailId = emailId;
        this.role = role;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getRole() {
        return role;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
