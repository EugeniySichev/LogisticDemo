package com.example.LogisticDemo.repo;

import com.example.LogisticDemo.domain.Mark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarkRepo extends JpaRepository<Mark, Long> {
}
