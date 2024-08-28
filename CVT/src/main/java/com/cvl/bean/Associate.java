package com.cvl.bean;

import jakarta.persistence.*;
import org.springframework.context.annotation.Scope;

@Scope("prototype")
@Entity
//@Table(name = "User")
public class Associate {
    @Id
    private int empId;
    private String name;
    private String emailId;
    private String password;
    private String role;

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
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

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
