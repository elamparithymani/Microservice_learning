package com.elas.microservices.department.service;

import com.elas.microservices.department.entity.Department;
import com.elas.microservices.department.respository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
    //    log.info("Inside of saveDepartment of Department Service");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
