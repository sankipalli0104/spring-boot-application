package com.spring.h2database.test.service;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class MathService {

    private final JdbcTemplate jdbcTemplate;

    public MathService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int calculateSum(int a, int b) {
        String sql = "SELECT calculate_sum(?, ?)";
        return jdbcTemplate.queryForObject(sql, Integer.class, a, b);
    }
}

