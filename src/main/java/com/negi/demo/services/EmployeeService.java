package com.negi.demo.services;

import com.negi.demo.entities.Employee;

import java.util.List;
import java.util.Map;

/**
 * Created by knegi on 10/7/17.
 */
public interface EmployeeService {

    List<Map<String, Object>> getAll();
}
