package mx.edu.utez.talenting.repository;

import mx.edu.utez.talenting.model.Vacancy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacancyRepository extends JpaRepository<Vacancy,Short> {
}
