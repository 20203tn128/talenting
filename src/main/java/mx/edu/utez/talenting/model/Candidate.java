package mx.edu.utez.talenting.model;

import jakarta.persistence.*;
import mx.edu.utez.talenting.converter.CandidateProfileConverter;
import mx.edu.utez.talenting.model.profile.CandidateProfile;

import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "user_id")
public class Candidate extends User {
    @Column(nullable = false)
    private String occupation;
    @Convert(converter = CandidateProfileConverter.class)
    @Column(nullable = false, columnDefinition = "JSON")
    private CandidateProfile profile;
    private String cvUrl;
    @ManyToMany()
    @JoinTable(joinColumns = {@JoinColumn(name = "candidate_id")}, inverseJoinColumns = {@JoinColumn(name = "vacancy_id")})
    private List<Vacancy> favoriteVacancies;
    @ManyToMany()
    @JoinTable(joinColumns = {@JoinColumn(name = "candidate_id")}, inverseJoinColumns = {@JoinColumn(name = "contact_id")})
    private List<Candidate> contacts;
}
