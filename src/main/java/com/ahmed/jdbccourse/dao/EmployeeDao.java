package com.ahmed.jdbccourse.dao;

import com.ahmed.jdbccourse.model.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> findAll();

    Employee findById(int id);

    void save(Employee employee);

    void deleteById(int id);
}
