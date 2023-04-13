package mx.edu.utez.talenting.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import mx.edu.utez.talenting.model.base.CatalogEntity;
import org.hibernate.annotations.SQLDelete;

@Entity
@SQLDelete(sql = "UPDATE city SET deleted = true WHERE id = ?")
public class City extends CatalogEntity {
    @ManyToOne(optional = false)
    private State state;
}
