package mx.edu.utez.talenting.model;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.*;
import mx.edu.utez.talenting.converter.StringListConverter;
import mx.edu.utez.talenting.model.base.UuidEntity;
import org.hibernate.annotations.Formula;
import org.hibernate.annotations.SQLDelete;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@SQLDelete(sql = "UPDATE vacancy SET deleted = true WHERE id = ?")
public class Vacancy extends UuidEntity {
    @NotBlank(message = "Debes de ingresar un titulo")
    @Size(max = 32, message = "Máximo de 32 caracteres")
    @Pattern(regexp = "[A-z ]*", message = "Solo puede contener letras")
    @Column(nullable = false, length = 32)
    private String title;
    @NotBlank(message = "Debes de ingresar una descripción")
    @Size(max = 32, message = "Máximo de 32 caracteres")
    @Pattern(regexp = "[A-z ]*", message = "Solo puede contener letras")
    @Column(nullable = false, length = 32)
    private String description;
    @ManyToOne(optional = false)
    private Company company;
    @ManyToOne(optional = false)
    private Recruiter author;
    @NotNull(message = "Debes de ingresar una fecha de  fin de vigencia")
    @Future(message = "La fecha no puede estar en pasado o presente")
    @Column(nullable = false)
    private LocalDateTime validUntil;
    @Formula("valid_until > Now")
    private Boolean available;
    @ManyToOne(optional = false)
    private VacancyState vacancyState;
    @Column(nullable = false)
    private boolean finished = false;
    @NotBlank(message = "Debes de seleccionar un Estado")
    @ManyToOne(optional = false)
    private City location;
    @NotBlank(message = "Debes de seleccionar una Modalidad")
    @ManyToOne(optional = false)
    private AttendanceMode attendanceMode;
    @Column(nullable = false, length = 45)
    private String schedule;
    @NotNull(message = "Debes de ingresar una fecha de  fin de vigencia")
    @Future(message = "La fecha no puede estar en pasado o presente")
    @Column(nullable = false)
    private LocalDate startDate;
    @Column(nullable = false)
    private double minSalary;
    @Column(nullable = false)
    private double maxSalary;
    @ManyToOne(optional = false)
    private PaymentFrecuency paymentFrecuency;
    @Convert(converter = StringListConverter.class)
    @Column(nullable = false, columnDefinition = "json")
    private List<String> benefits;
}
