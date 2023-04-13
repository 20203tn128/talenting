package mx.edu.utez.talenting.service;

import mx.edu.utez.talenting.model.Candidate;

import java.util.List;

public interface ICandidateService {
    List<Candidate> findAll();
    boolean save(Candidate candidate);
}
