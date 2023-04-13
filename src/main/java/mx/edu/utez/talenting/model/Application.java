package mx.edu.utez.talenting.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import mx.edu.utez.talenting.model.base.UuidEntity;
import org.hibernate.annotations.SQLDelete;

@Entity
@SQLDelete(sql = "UPDATE application SET deleted = true WHERE id = ?")
public class Application extends UuidEntity {
    @ManyToOne(optional = false)
    private Vacancy vacancy;
    @ManyToOne(optional = false)
    private Candidate candidate;
    @ManyToOne(optional = false)
    private ApplicationState applicationState;
    @Column(nullable = false)
    private boolean finished = false;
}
