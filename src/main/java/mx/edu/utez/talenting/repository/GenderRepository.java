package mx.edu.utez.talenting.repository;

import mx.edu.utez.talenting.model.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderRepository extends JpaRepository<Gender,Short> {

}
