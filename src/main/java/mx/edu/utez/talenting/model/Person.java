package mx.edu.utez.talenting.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import mx.edu.utez.talenting.model.base.UuidEntity;
import mx.edu.utez.talenting.util.Regex;
import org.hibernate.annotations.SQLDelete;

import java.time.LocalDate;

@Entity(name = "user")
@SQLDelete(sql = "UPDATE person SET deleted = true WHERE id = ?")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Person extends UuidEntity {
    //hibernate anotations name
    @NotBlank(message = "Debes de ingresar un nombre") @Size(max = 45, message = "Máximo de 45 caracteres") @Pattern(regexp = Regex.NAMES, message = "Solo puede contener letras")
//jpa anotation name
    @Column(nullable = false, length = 45)
    private String name;
    //hibernate anotation surname
    @NotBlank(message = "Debes de ingresar un apellido") @Size(max = 45, message = "Máximo de 45 caracteres") @Pattern(regexp = Regex.NAMES, message = "Solo puede contener letras")
// jpa anotation surname
    @Column(nullable = false, length = 45)
    private String surname;
    //hibernate anotation lastname
    @Size(max = 45, message = "Máximo de 45 caracteres") @Pattern(regexp = Regex.NAMES, message = "Solo puede contener letras")
    //jpa anotation lastname
    @Column(nullable = true, length = 45)
    private String lastname;
    //hibernate anotation birthdate
    @NotNull(message = "Debes de ingresar una fecha de nacimiento") @Past(message = "La fecha no puede estar en presente")
// jpa anotattion birthdate
    @Column(nullable = false)
    private LocalDate birthdate;
    //hibernate anotation gender
    @NotBlank(message = "Debes de seleccionar un genero")
// jpa anotation gender
    @ManyToOne(optional = false)
    private Gender gender;
}
