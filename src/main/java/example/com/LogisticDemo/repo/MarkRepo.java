package example.com.LogisticDemo.repo;

import example.com.LogisticDemo.domain.Mark;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarkRepo extends JpaRepository<Mark, Long> {
}
