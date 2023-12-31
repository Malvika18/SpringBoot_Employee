package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {

    @Autowired
    ApiService ser;

//add employee

    @PostMapping("/add")
    public boolean add(@RequestBody Employee e)
    {
        return ser.addEmployee(e);
    }

//get all employee

    @GetMapping("/display")
    public List <Employee> getAll()
    {
        return ser.getAll();
    }

//delete Employee

    @DeleteMapping("/delete/{id}")
    public void remove (@PathVariable Integer empId)
    {
        ser.deleteEmployee(empId);
    }


//Update Employee
    
    
}
