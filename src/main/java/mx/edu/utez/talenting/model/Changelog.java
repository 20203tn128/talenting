package mx.edu.utez.talenting.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Changelog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String entity;
    @Column(nullable = false, length = 6)
    private String movement;
    @Column(columnDefinition = "JSON")
    private String prevValue;
    @Column(columnDefinition = "JSON")
    private String newValue;
    @Column(nullable = false)
    private LocalDateTime date;
    private String author;
}
