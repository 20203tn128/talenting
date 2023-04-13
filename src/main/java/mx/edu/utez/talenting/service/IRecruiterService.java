package mx.edu.utez.talenting.service;

import mx.edu.utez.talenting.model.Recruiter;

import java.util.List;

public interface IRecruiterService {
    List<Recruiter> findAll();
    boolean save(Recruiter recruiter);
}
