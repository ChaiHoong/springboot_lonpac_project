package com.example.form_validation.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_data")
public class User{

    //primarykey
    @Id
    @GeneratedValue
    @Column(name = "userID")
    private int user_id;

    @Column(name = "icNumber")
    private String icNumber;

    @Column(name = "gender")
    private String gender;

    @Column(name = "birth_date")
    private LocalDate dob;

    @Column(name = "postcode")
    private String postcode;

    @Column(name = "town")
    private String town;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getIcNumber(){
        return icNumber;
    }

    public void setIcNumber(String icNumber) {
        this.icNumber = icNumber;
    }

    @Override
    public String toString() {
        return "User [icNumber=" + icNumber + ", gender=" + gender + ", dob=" + dob + ", postcode=" + postcode
                + ", town=" + town + "]";
    }
}