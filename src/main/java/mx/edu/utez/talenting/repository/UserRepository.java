package mx.edu.utez.talenting.repository;

import mx.edu.utez.talenting.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
