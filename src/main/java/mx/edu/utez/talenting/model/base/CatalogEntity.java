package mx.edu.utez.talenting.model.base;

import jakarta.persistence.*;

@MappedSuperclass
public class CatalogEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short id;
    @Column(nullable = false, length = 45)
    private String name;
}
