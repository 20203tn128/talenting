package mx.edu.utez.talenting.service.base;

import java.util.List;

public interface CatalogService<T, I> {
    List<T> findAll();
}
