package com.example.EmployeeCrud.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import  com.example.EmployeeCrud.repo.EmployeeRepo;


import  com.example.EmployeeCrud.model.Employee;

@Service
@Transactional
public class EmployeeService {
   private final EmployeeRepo employeeRepo;
   
   @Autowired
   public EmployeeService(EmployeeRepo employeeRepo) {
	   this.employeeRepo = employeeRepo;
   }
   
   public Employee addEmployee(Employee employee) {
	   return employeeRepo.save(employee);
   }
   public List<Employee> findAllEmployees() {
       return employeeRepo.findAll();
   }

   public Employee updateEmployee(Employee employee) {
       return employeeRepo.save(employee);
   }

   public Employee findEmployeeById(Long id) throws Exception {
	   
	   
       return employeeRepo.findEmployeeById(id)
               .orElseThrow(() -> new Exception("User by id " + id + " was not found"));
   }
  

   public void deleteEmployee(Long id){
       employeeRepo.deleteEmployeeById(id);
     System.out.println("id  ==== "+id );
   }
      
   
}
