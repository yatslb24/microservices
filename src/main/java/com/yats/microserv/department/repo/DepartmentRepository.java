package com.yats.microserv.department.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yats.microserv.department.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

	Department findDepartmentById(Long departmentId);

}
