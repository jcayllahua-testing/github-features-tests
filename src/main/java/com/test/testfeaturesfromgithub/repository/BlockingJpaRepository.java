package com.test.testfeaturesfromgithub.repository;

import com.test.testfeaturesfromgithub.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface BlockingJpaRepository extends JpaRepository<User, Long> {

    @Query("SELECT u.name FROM User u WHERE u.id = :id")
    Optional<String> findUserNameById(Long id);

    @Query("SELECT u FROM User u WHERE u.status = 'ACTIVE'")
    List<User> findActiveUsers();

    @Query("UPDATE User u SET u.name = :name WHERE u.id = :id")
    void updateUserName(Long id, String name);
}


