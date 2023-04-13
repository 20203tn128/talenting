package mx.edu.utez.talenting.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import mx.edu.utez.talenting.model.base.UuidEntity;
import org.hibernate.annotations.SQLDelete;

@Entity
@SQLDelete(sql = "UPDATE company SET deleted = true WHERE id = ?")
public class Company extends UuidEntity {
    @NotNull(message = "Debes de ingresar un nombre de empresa")
    @Size(max = 127, message = "Máximo de 127 caracteres")
    @Column(nullable = false, length = 127)
    private String name;
    @NotBlank(message = "Debes de seleccionar un Estado")
    @ManyToOne(optional = false)
    private City location;
}
