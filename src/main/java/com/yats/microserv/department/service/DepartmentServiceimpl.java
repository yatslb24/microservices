package com.yats.microserv.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yats.microserv.department.entity.Department;
import com.yats.microserv.department.repo.DepartmentRepository;


import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class DepartmentServiceimpl implements DepartmentService {

@Autowired
private DepartmentRepository departmentRepository;

@Override
public Department save(Department department) {
	//log.info("inside save method of service implementation");
	departmentRepository.save(department);
	return department;
}

@Override
public Department findDepartmentById(Long departmentId) {
	//Log.info("inside findDepartmentById method of service implementation");
	return departmentRepository.findDepartmentById(departmentId);
}



}
