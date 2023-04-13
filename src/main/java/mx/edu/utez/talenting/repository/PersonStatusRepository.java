package mx.edu.utez.talenting.repository;

import mx.edu.utez.talenting.model.PersonStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonStatusRepository extends JpaRepository<PersonStatus,Short> {
}
