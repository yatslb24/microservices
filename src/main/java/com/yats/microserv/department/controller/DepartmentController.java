package com.yats.microserv.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.yats.microserv.department.entity.Department;
import com.yats.microserv.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/")
	public Department save(@RequestBody Department department) {
		//Log.info("inside save method of controller");
		departmentService.save(department);
		return department;
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public Department findDepartmentById(@PathVariable("id") long departmentId) {
		//Log.info("inside findDepartmentById method of controller");
		return departmentService.findDepartmentById(departmentId);
	}

}
