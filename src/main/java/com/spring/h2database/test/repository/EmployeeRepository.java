package com.spring.h2database.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spring.h2database.test.model.EmployeeEntity;
 
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

    @Procedure("GET_EMPLOYEE") // Matches the stored procedure name
    EmployeeEntity getEmployee(@Param("employee_id") Long employeeId); // Make sure the parameter name matches
 
}
