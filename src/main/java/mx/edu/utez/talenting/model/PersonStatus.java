package mx.edu.utez.talenting.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import mx.edu.utez.talenting.model.base.UuidEntity;
import org.hibernate.annotations.SQLDelete;

@Entity
@SQLDelete(sql = "UPDATE person_status SET deleted = true WHERE id = ?")
public class PersonStatus extends UuidEntity {
    @Column(nullable = false, length = 45)
    private String name;
}
