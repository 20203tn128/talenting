package mx.edu.utez.talenting.repository;

import mx.edu.utez.talenting.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Short> {
}
