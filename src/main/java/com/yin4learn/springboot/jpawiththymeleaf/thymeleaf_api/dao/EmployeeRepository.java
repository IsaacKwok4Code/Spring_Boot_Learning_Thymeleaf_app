package com.yin4learn.springboot.jpawiththymeleaf.thymeleaf_api.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.yin4learn.springboot.jpawiththymeleaf.thymeleaf_api.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	public List<Employee> findAllByOrderByLastNameAsc();
}
