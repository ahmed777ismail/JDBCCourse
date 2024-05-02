package com.ahmed.jdbccourse;


import com.ahmed.jdbccourse.model.Employee;
import com.ahmed.jdbccourse.dao.EmployeeDao;
import com.ahmed.jdbccourse.dao.EmployeeDaoImpl;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDaoImpl();

        Employee employee = new Employee(0,"Ahmed",true,new Date(),3000d);

        employeeDao.save(employee);
    }
}
