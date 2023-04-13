package mx.edu.utez.talenting.model;

import jakarta.persistence.Entity;
import mx.edu.utez.talenting.model.base.CatalogEntity;
import org.hibernate.annotations.SQLDelete;

@Entity
@SQLDelete(sql = "UPDATE role SET deleted = true WHERE id = ?")
public class Role extends CatalogEntity {
}
