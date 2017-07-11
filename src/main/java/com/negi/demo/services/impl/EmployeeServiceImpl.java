package com.negi.demo.services.impl;

import com.negi.demo.entities.Employee;
import com.negi.demo.repos.EmployeeRepo;
import com.negi.demo.services.EmployeeService;

import java.util.List;
import java.util.Map;

/**
 * Created by knegi on 10/7/17.
 */
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepo employeeRepo;

    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public List<Map<String, Object>> getAll() {
        return employeeRepo.findAll();
    }
}
