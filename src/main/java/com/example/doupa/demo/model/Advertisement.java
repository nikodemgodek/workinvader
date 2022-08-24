package com.example.doupa.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "offers")
public class Advertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 30, message = "Company name can have maximum 30 digits.")
    @Size(min = 2, message = "Company name must have minimum 2 digits.")
    private String companyName;

    @Size(min = 10, message = "Position name must have minimum 10 digits.")
    private String position;

    @NotEmpty(message = "Skills field is necessary.")
    private String skills;


    private String contractType;

    @NotNull(message = "Minimum salary field is necessary.")
    private Integer minSalary;

    @NotNull(message = "Maximum salary field is necessary.")
    private Integer maxSalary;

    private String currency;

    @NotEmpty(message = "Location field is necessary.")
    private String location;

    @NotEmpty(message = "About position field is necessary.")
    @Size(min = 30, message = "About position field must have minimum 30 digits.")
    private String description;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date deadline;

    private String workMode;

    public Advertisement() {

    }
    public Advertisement(Long id, String companyName, String position, String skills, String contractType, Integer minSalary, Integer maxSalary, String currency, String location, String description, Date deadline, String workMode) {
        this.id = id;
        this.companyName = companyName;
        this.position = position;
        this.skills = skills;
        this.contractType = contractType;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.currency = currency;
        this.location = location;
        this.description = description;
        this.deadline = deadline;
        this.workMode = workMode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public Integer getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(Integer minSalary) {
        this.minSalary = minSalary;
    }

    public Integer getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(Integer maxSalary) {
        this.maxSalary = maxSalary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getWorkMode() {
        return workMode;
    }

    public void setWorkMode(String workMode) {
        this.workMode = workMode;
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "companyName='" + companyName + '\'' +
                ", position='" + position + '\'' +
                ", skills='" + skills + '\'' +
                ", contractType=" + contractType +
                ", minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                ", currency=" + currency +
                ", location='" + location + '\'' +
                ", description='" + description + '\'' +
                ", deadline=" + deadline +
                ", workMode=" + workMode +
                '}';
    }
}
