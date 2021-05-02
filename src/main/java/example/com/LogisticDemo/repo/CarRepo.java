package example.com.LogisticDemo.repo;

import example.com.LogisticDemo.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car, Long> {
}
