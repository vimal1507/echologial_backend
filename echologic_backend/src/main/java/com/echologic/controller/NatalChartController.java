package com.echologic.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

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
    public ResponseEntity<String> getChart(@RequestBody NatalChartRequest request) {
        

        return ResponseEntity.ok(chartService.chartCalculation("1990-01-15", "vimal", 28.3680, 28.3680));
    }

}
