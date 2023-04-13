package mx.edu.utez.talenting.service;

import mx.edu.utez.talenting.model.Vacancy;

import java.util.List;

public interface IVacancyService {
    List<Vacancy> findAll();
}
