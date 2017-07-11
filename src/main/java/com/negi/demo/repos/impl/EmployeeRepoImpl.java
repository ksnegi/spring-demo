package com.negi.demo.repos.impl;

import com.negi.demo.entities.Employee;
import com.negi.demo.repos.EmployeeRepo;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

/**
 * Created by knegi on 10/7/17.
 */
public class EmployeeRepoImpl implements EmployeeRepo {
    private JdbcTemplate jdbcTemplate;

    public EmployeeRepoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Map<String, Object>> findAll() {
        String sql = "SELECT * FROM employees.employees LIMIT 0,10";
        return jdbcTemplate.queryForList(sql);
    }
}
