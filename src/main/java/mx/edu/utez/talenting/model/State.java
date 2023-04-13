package mx.edu.utez.talenting.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import mx.edu.utez.talenting.model.base.CatalogEntity;
import org.hibernate.annotations.SQLDelete;

import java.util.ArrayList;
import java.util.List;

@Entity
@SQLDelete(sql = "UPDATE state SET deleted = true WHERE id = ?")
public class State extends CatalogEntity {
    @OneToMany(mappedBy = "state")
    private List<City> cities = new ArrayList<>();
}
