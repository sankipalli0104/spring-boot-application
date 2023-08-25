package com.spring.h2database.test.controller;

import com.spring.h2database.test.model.EmployeeEntity;
import com.spring.h2database.test.repository.EmployeeRepository;
import com.spring.h2database.test.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.engine.ElementModelStructureHandler;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class EmployerController {
    @Autowired
    private EmployeeRepository employeeService;

    @Autowired
    private EmployeeService  employee;

    @GetMapping("/getEmployees")
    public List<EmployeeEntity> getAllEmployees() {
        return employeeService.findAll();
    }

    @GetMapping("/getEmployee/{id}")
    public EmployeeEntity getAllEmployees(@PathVariable("id") Long id) {
        return employeeService.findById(id).get();
    }

    @PostMapping("/saveEmployee")
    private Long saveEmployee(@RequestBody EmployeeEntity employee)
    {
        employeeService.save(employee);
        return employee.getId();
    }

    @PostMapping("/saveAllEmployees")
    private Integer saveAllEmployee(@RequestBody List<EmployeeEntity> employee)
    {
        employeeService.saveAll(employee);
        return employee.size();
    }



    @DeleteMapping("/deleteEmployee/{id}")
    private void deleteEmployeeById(@PathVariable("id") Long id) {
        employeeService.deleteById(id);
    }

//    @GetMapping("/{id}")
//    public EmployeeEntity getEmployee(@PathVariable("id") Long id) {
//        return employee.callStoredProcedure(id);
//    }


}
