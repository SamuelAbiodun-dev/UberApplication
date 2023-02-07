package uberApp4semicolon.paragon.demo.data.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uberApp4semicolon.paragon.demo.data.models.Driver;

public interface DriverRepositories extends JpaRepository<Driver, Long> {
}
