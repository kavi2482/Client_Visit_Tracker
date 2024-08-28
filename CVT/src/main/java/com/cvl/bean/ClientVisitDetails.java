package com.cvl.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import org.springframework.context.annotation.Scope;

import java.util.Date;


@Scope("prototype")
@Entity
public class ClientVisitDetails {
    @Id
    private String name;
    private String designation;
    private String period;
    @Temporal(TemporalType.DATE)
    private Date fromDate;
    @Temporal(TemporalType.DATE)
    private Date toDate;
    private String visitLocation;
    private String operatingCompany;
    private String purpose;
    private String visitStatus;
    private boolean rescheduledFlag;
    private String clientPartnerName;
    private String portfolioGroup;
    private String portfolio;
    private String project;

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public String getPeriod() {
        return period;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public String getVisitLocation() {
        return visitLocation;
    }

    public String getOperatingCompany() {
        return operatingCompany;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getVisitStatus() {
        return visitStatus;
    }

    public boolean isRescheduledFlag() {
        return rescheduledFlag;
    }

    public String getClientPartnerName() {
        return clientPartnerName;
    }

    public String getPortfolioGroup() {
        return portfolioGroup;
    }

    public String getPortfolio() {
        return portfolio;
    }

    public String getProject() {
        return project;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public void setVisitLocation(String visitLocation) {
        this.visitLocation = visitLocation;
    }

    public void setOperatingCompany(String operatingCompany) {
        this.operatingCompany = operatingCompany;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setVisitStatus(String visitStatus) {
        this.visitStatus = visitStatus;
    }

    public void setRescheduledFlag(boolean rescheduledFlag) {
        this.rescheduledFlag = rescheduledFlag;
    }

    public void setClientPartnerName(String clientPartnerName) {
        this.clientPartnerName = clientPartnerName;
    }

    public void setPortfolioGroup(String portfolioGroup) {
        this.portfolioGroup = portfolioGroup;
    }

    public void setPortfolio(String portfolio) {
        this.portfolio = portfolio;
    }

    public void setProject(String project) {
        this.project = project;
    }
}
