package com.echologic.dto;

import org.antlr.v4.runtime.misc.NotNull;

public class NatalChartRequest {
   
    private String name;

    
    private String birthdate;     // e.g., "1990‑01‑15"

    
    private String timeOfBirth;    // e.g., "14:30" or "14:30:00"

    
    private String timeZone;       // e.g., "Asia/Kolkata"

   
    private Double latitude;

    
    private Double longitude;

    // Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getTimeOfBirth() {
        return timeOfBirth;
    }

    public void setTimeOfBirth(String timeOfBirth) {
        this.timeOfBirth = timeOfBirth;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}

