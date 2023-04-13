package mx.edu.utez.talenting.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "person_id")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class User extends Person {
    @NotNull(message = "Debes de ingresar un nombre de usuario")
    @Size(max = 45, message = "Máximo de 45 caracteres")
    @Column(nullable = false, length = 45)
    private String username;
    @NotNull(message = "Debes de ingresar un número de teléfono")
    @Size(max = 22, message = "Máximo de 10 digitos")
    @Column(nullable = false, length = 22)
    private String phone;
    @NotNull(message = "Debes de ingresar un correo electrónico")
    @Size(max = 255, message = "Máximo de 45 caracteres")
    @Column(nullable = false, length = 255)
    private String email;
    @NotNull(message = "Debes de ingresar un correo electrónico")
    @Size(max = 255, message = "Máximo de 45 caracteres")
    @Column(nullable = false, length = 255)
    private String password;
    private String pictureUrl;
    @ManyToMany()
    @JoinTable(joinColumns = {@JoinColumn(name = "user_id")}, inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private List<Role> roles;
}
