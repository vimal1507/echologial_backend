package com.echologic.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.codehaus.jparsec.functors.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.echologic.dto.NatalChartRequest;
import com.echologic.dto.NatalChartResponse;
import com.echologic.service.NatalChartService;

@Controller
@RequestMapping("/api/v1")
public class NatalChartController {

    private final NatalChartService chartService = new NatalChartService();

    @PostMapping("/natal-chart")
    public ResponseEntity<NatalChartResponse> getChart(@RequestBody NatalChartRequest request) {
        // Convert request’s date/time + timezone to UTC LocalDateTime
        LocalDateTime utcDateTime = convertToUTC(request.getBirthdate(), request.getTimeOfBirth(), request.getTimeZone());
        NatalChartService.PlanetPosition sunPos = chartService.computeSunPosition(utcDateTime, request.getLatitude(), request.getLongitude());

        NatalChartResponse resp = new NatalChartResponse();
        resp.setName(request.getName());
        resp.setBirthdate(request.getBirthdate());
        resp.setTimeOfBirth(request.getTimeOfBirth());
        resp.setLatitude(request.getLatitude());
        resp.setLongitude(request.getLongitude());
//        resp.setChartDetails(Map.of(sunPos.getPlanetName(), sunPos.toString()));

        return ResponseEntity.ok(resp);
    }

    private LocalDateTime convertToUTC(String date, String time, String timeZone) {
        LocalDate ld = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        LocalTime lt = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm"));
        ZoneId zid = ZoneId.of(timeZone);  // e.g., "Asia/Kolkata"
        ZonedDateTime zdt = ZonedDateTime.of(ld, lt, zid);
        return zdt.withZoneSameInstant(ZoneOffset.UTC).toLocalDateTime();
    }
}
