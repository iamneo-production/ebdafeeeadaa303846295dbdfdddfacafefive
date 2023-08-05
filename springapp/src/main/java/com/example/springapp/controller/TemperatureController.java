package com.example.springapp.controller;



import com.example.springapp.service.TemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperatureController {

    private final TemperatureService temperatureService;

    @Autowired
    public TemperatureController(TemperatureService temperatureService) {
        this.temperatureService = temperatureService;
    }

    @PostMapping("/convert")
    public double convertToCelsius(@RequestBody double temperatureCelsius) {
        return temperatureService.convertToCelsius(temperatureCelsius);
    }
}
