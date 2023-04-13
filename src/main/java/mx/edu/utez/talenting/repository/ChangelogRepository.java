package mx.edu.utez.talenting.repository;

import mx.edu.utez.talenting.model.Changelog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChangelogRepository extends JpaRepository<Changelog, Long> {
}
