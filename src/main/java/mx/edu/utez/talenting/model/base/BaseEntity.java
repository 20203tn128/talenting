package mx.edu.utez.talenting.model.base;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.Where;

@MappedSuperclass
@Where(clause = "deleted = false")
public class BaseEntity extends AuditableEntity {
    @Column(nullable = false)
    private boolean deleted = false;
}
