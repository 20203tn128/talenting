package mx.edu.utez.talenting.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.SQLDelete;

@Entity
@SQLDelete(sql = "UPDATE recruiter SET deleted = true WHERE id = ?")
@PrimaryKeyJoinColumn(name = "user_id")
public class Recruiter extends User {
    @NotNull(message = "Debes de ingresar un puesto de trabajo")
    @Size(max = 32, message = "Maximo de 32 carcateres")
    @Column(nullable = false, length = 32)
    private String position;
    @NotBlank(message = "Debes de seleccionar una empresa")
    @OneToOne(optional = false, cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private Company company;
}
