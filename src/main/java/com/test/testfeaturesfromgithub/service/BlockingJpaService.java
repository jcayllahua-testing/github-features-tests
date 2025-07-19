package com.test.testfeaturesfromgithub.service;

import com.test.testfeaturesfromgithub.repository.BlockingJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import java.util.List;

@Service
public class BlockingJpaService {

    @Autowired
    private BlockingJpaRepository repository;

    public Mono<Void> updateUserName(Long id, String name) {
        repository.updateUserName(id, name);
        return Mono.empty();
    }
}

