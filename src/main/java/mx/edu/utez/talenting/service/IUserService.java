package mx.edu.utez.talenting.service;

import mx.edu.utez.talenting.model.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();
    boolean save(User user);
}
