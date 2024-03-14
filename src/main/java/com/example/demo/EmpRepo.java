package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmpRepo extends JpaRepository<Emp, Integer>{

	@Query(value = "select emp.ename,emp.esalary,address.aid,address.city,address.state,address.country from emp,address where address.eid=emp.empid AND emp.ename=:name", nativeQuery = true)
	public List<Object[]> getdetails(String name);
}
