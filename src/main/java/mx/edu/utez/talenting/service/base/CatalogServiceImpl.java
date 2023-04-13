package mx.edu.utez.talenting.service.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class CatalogServiceImpl <T, I, R extends JpaRepository<T, I>> {
    @Autowired
    R repository;

    public List<T> findAll() {
        return repository.findAll();
    }
}
