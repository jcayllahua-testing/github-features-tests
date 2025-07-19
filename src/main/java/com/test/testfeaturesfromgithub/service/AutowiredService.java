package com.test.testfeaturesfromgithub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.testfeaturesfromgithub.repository.BlockingJpaRepository;

@Service
public class AutowiredService {

    @Autowired
    private BlockingJpaRepository repository;

    @Autowired
    private AnotherDependency anotherDependency;

    public String processUser(Long id) {
        return repository.findById(id)
                .toString();
    }

    public void doSomething() {
        anotherDependency.performAction();
    }
}


