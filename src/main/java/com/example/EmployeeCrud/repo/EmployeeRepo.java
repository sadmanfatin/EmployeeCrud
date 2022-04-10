package com.example.EmployeeCrud.repo;
import com.example.EmployeeCrud.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
