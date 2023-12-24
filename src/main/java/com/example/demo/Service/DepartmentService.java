package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Department;

public interface DepartmentService {

    //create
    public Department saveDepartment(Department department);
    //findAll
    public List<Department> fetchDepartmentList();
    //findById
    public Department fetchDepartmentById(Long departmentId);
    //deleteById
    public void deleteDepartmentById(Long departmentId);
    //update
    public Department updateDepartment(Long departmentId, Department department);
    public Department fetchDepartmentByName(String departmentName);
    
}
