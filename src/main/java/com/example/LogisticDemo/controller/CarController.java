package com.example.LogisticDemo.controller;

import com.example.LogisticDemo.domain.Car;
import com.example.LogisticDemo.repo.CarRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/car")
public class CarController extends AbstractRestController<Car, CarRepo> {
    public CarController(CarRepo repo) {
        super(repo);
    }
}
