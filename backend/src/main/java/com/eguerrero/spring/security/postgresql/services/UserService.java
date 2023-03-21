package com.eguerrero.spring.security.postgresql.services;
import java.util.List;
import java.util.Optional;

import com.eguerrero.spring.security.postgresql.models.User;

public interface UserService {

    Optional<User> getById(Long id);

    List<User> getAll();

    public User update(User model, Long id);

    //void delete(Long id);
}
