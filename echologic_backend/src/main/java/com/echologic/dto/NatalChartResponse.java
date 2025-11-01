package com.echologic.dto;

import java.util.List;

public class NatalChartResponse {

    private String name;
    private String birthdate;
    private String timeOfBirth;
    private String timeZone;
    private Double latitude;
    private Double longitude;

    private List<PlanetDetail> planets;
    private List<HouseDetail> houses;

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

    public List<PlanetDetail> getPlanets() {
        return planets;
    }

    public void setPlanets(List<PlanetDetail> planets) {
        this.planets = planets;
    }

    public List<HouseDetail> getHouses() {
        return houses;
    }

    public void setHouses(List<HouseDetail> houses) {
        this.houses = houses;
    }

    // Inner classes for details

    public static class PlanetDetail {
        private String planetName;
        private String sign;
        private double degree;
        private int houseNumber;
        private boolean retrograde;

        // Getters & Setters
        public String getPlanetName() {
            return planetName;
        }
        public void setPlanetName(String planetName) {
            this.planetName = planetName;
        }
        public String getSign() {
            return sign;
        }
        public void setSign(String sign) {
            this.sign = sign;
        }
        public double getDegree() {
            return degree;
        }
        public void setDegree(double degree) {
            this.degree = degree;
        }
        public int getHouseNumber() {
            return houseNumber;
        }
        public void setHouseNumber(int houseNumber) {
            this.houseNumber = houseNumber;
        }
        public boolean isRetrograde() {
            return retrograde;
        }
        public void setRetrograde(boolean retrograde) {
            this.retrograde = retrograde;
        }
    }

    public static class HouseDetail {
        private int houseNumber;
        private double cuspDegree;
        private String sign;

        // Getters & Setters
        public int getHouseNumber() {
            return houseNumber;
        }
        public void setHouseNumber(int houseNumber) {
            this.houseNumber = houseNumber;
        }
        public double getCuspDegree() {
            return cuspDegree;
        }
        public void setCuspDegree(double cuspDegree) {
            this.cuspDegree = cuspDegree;
        }
        public String getSign() {
            return sign;
        }
        public void setSign(String sign) {
            this.sign = sign;
        }
    }
}

