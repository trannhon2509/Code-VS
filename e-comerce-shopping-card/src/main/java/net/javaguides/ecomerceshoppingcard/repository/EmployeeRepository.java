package net.javaguides.ecomerceshoppingcard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.ecomerceshoppingcard.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
}