package mx.edu.utez.talenting.model;

import jakarta.persistence.Entity;
import mx.edu.utez.talenting.model.base.CatalogEntity;
import org.hibernate.annotations.SQLDelete;

@Entity
@SQLDelete(sql = "UPDATE vacancy_state SET deleted = true WHERE id = ?")
public class VacancyState extends CatalogEntity {
}
