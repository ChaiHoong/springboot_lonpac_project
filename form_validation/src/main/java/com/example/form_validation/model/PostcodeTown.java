package com.example.form_validation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "postcode_town")
public class PostcodeTown {

    @Id
    @Column(name = "postcode")
    private String postcode;

    @Column(name = "town")
    private String town;

    // Getters and Setters
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
}
