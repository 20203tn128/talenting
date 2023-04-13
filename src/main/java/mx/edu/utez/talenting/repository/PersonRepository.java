package mx.edu.utez.talenting.repository;

import mx.edu.utez.talenting.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PersonRepository extends JpaRepository<Person, UUID> {
}
