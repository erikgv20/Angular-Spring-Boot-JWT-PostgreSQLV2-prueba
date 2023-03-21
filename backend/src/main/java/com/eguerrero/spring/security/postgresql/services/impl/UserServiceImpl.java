package com.eguerrero.spring.security.postgresql.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import com.eguerrero.spring.security.postgresql.models.User;
import com.eguerrero.spring.security.postgresql.repository.UserRepository;
import com.eguerrero.spring.security.postgresql.services.UserService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.persistence.EntityNotFoundException;
import javax.persistence.EntityManager;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
	private UserRepository repository;
    @Autowired 
    EntityManager entityManager;

    @Override
	@Transactional(readOnly = true)
    public List<User> getAll() {
        return repository.findAll().stream().collect(Collectors.toList());
    }

    @Override
	@Transactional(readOnly = true)
    public Optional<User> getById(Long id) {
        return repository.findById(id);
    }

    @Override
	@Transactional
    public User update(User model, Long id) {
        if(repository.findById(id).isPresent()){
            User updatedVisitanteTipoEntity = repository.save(model);
            return updatedVisitanteTipoEntity;
        }else{
            throw new EntityNotFoundException("Objecto with" + id.toString() + " not found in the database");
        }
    }
    
}
