package com.yats.microserv.department.service;

import org.springframework.stereotype.Service;

import com.yats.microserv.department.entity.Department;

public interface DepartmentService {
	
	public Department save(Department department);
	 public Department findDepartmentById(Long departmentId);

}
