package com.poly.demo01.Bean;

import org.springframework.stereotype.Component;

@Component
public class SchoolInformation {
    private String fullName ="FPTPOLY";
    private String location = "TPHCM";

    public SchoolInformation(){

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
