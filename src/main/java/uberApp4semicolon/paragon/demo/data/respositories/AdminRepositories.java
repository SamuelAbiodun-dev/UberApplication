package uberApp4semicolon.paragon.demo.data.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uberApp4semicolon.paragon.demo.data.models.Admin;

public interface AdminRepositories extends JpaRepository<Admin, Long> {
}
