package mx.edu.utez.talenting.service;

import mx.edu.utez.talenting.model.Person;

import java.util.List;

public interface IPersonService {
    List<Person> findAll();
    boolean save(Person person);
}
