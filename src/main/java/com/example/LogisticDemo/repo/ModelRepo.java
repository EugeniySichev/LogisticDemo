package com.example.LogisticDemo.repo;

import com.example.LogisticDemo.domain.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepo extends JpaRepository<Model, Long> {
}
