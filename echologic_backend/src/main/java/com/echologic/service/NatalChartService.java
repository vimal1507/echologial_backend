package com.echologic.service;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class NatalChartService {

    /**
     * Compute simplified zodiac sign & degree for the Sun given UTC date/time.
     * (This is illustrative only.)
     */
    public PlanetPosition computeSunPosition(LocalDateTime utcDateTime, double latitude, double longitude) {
        // For simplicity: we will mock the Sun’s ecliptic longitude as (dayOfYear / 365.25 * 360)
        int dayOfYear = utcDateTime.getDayOfYear();
        double approxLongitude = (dayOfYear / 365.25) * 360.0;

        approxLongitude = approxLongitude % 360.0;

        String sign = zodiacSignFromLongitude(approxLongitude);
        double degreeInSign = approxLongitude % 30.0;

        return new PlanetPosition("Sun", sign, degreeInSign);
    }

    private String zodiacSignFromLongitude(double longitude) {
        String[] signs = {
            "Aries", "Taurus", "Gemini", "Cancer",
            "Leo", "Virgo", "Libra", "Scorpio",
            "Sagittarius", "Capricorn", "Aquarius", "Pisces"
        };
        int index = (int)(longitude / 30);
        return signs[index];
    }

    // Helper class for result
    public static class PlanetPosition {
        private String planetName;
        private String sign;
        private double degree;

        public PlanetPosition(String planetName, String sign, double degree) {
            this.planetName = planetName;
            this.sign = sign;
            this.degree = degree;
        }

        public String getPlanetName() { return planetName; }
        public String getSign() { return sign; }
        public double getDegree() { return degree; }

        @Override
        public String toString() {
            return planetName + " is at " + String.format("%.2f", degree) + "° in " + sign;
        }
    }
}
