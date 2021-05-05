package com.example.LogisticDemo.repo;

import com.example.LogisticDemo.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car, Long> {
}
