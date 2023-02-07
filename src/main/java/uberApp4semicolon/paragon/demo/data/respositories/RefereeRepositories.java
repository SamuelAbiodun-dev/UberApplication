package uberApp4semicolon.paragon.demo.data.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uberApp4semicolon.paragon.demo.data.models.Referee;

public interface RefereeRepositories extends JpaRepository<Referee, Long> {
}
