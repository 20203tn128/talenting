package mx.edu.utez.talenting.repository;

import mx.edu.utez.talenting.model.Recruiter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RecruiterRepository extends JpaRepository<Recruiter, UUID> {
}
