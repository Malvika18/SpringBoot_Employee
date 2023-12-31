package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class ApiService {
    @Autowired
    private EmployeeRepository rep;

//Add Employee
    public boolean addEmployee(Employee e)
    {
        Employee e1 = rep.save(e);
        if(e1!=null)
        {
            return true;
        }
        else{
            return false;
        }
    }

//Get the List of All Employee

    public List<Employee>getAll()
    {
        return rep.findAll();
    }

//Delete Employee

    public boolean deleteEmployee(Integer empId)
    {
        if(rep.existsById(empId))
        {
            rep.deleteById(empId);
            return true;
        }
        return false;
    }

//Update Employee

    
}
