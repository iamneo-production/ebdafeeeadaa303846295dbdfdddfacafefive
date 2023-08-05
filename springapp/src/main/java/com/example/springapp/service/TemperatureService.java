package com.example.springapp.service;

import org.springframework.stereotype.Service;

@Service
public class TemperatureService {

    public double convertToCelsius(double temperatureCelsius) {
        return (temperatureCelsius * 9/5) + 32;
    }
}
