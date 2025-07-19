package com.test.testfeaturesfromgithub.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;

@Repository
public class BadSqlRepository {

    private final JdbcTemplate jdbcTemplate;

    public BadSqlRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Map<String, Object>> getAllUsers() {
        return jdbcTemplate.queryForList("SELECT * FROM users");
    }

    public List<Map<String, Object>> getAllOrders() {
        return jdbcTemplate.queryForList("SELECT * FROM orders WHERE status = 'ACTIVE'");
    }

    public void callStoredProcedure() {
        jdbcTemplate.execute("CALL get_user_statistics()");
    }

    public void anotherStoredProcedure(Long userId) {
        jdbcTemplate.execute("CALL update_user_last_login(" + userId + ")");
    }
}
