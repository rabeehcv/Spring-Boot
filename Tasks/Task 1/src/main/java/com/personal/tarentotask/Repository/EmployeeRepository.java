package com.personal.tarentotask.Repository;

import com.personal.tarentotask.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("SELECT e FROM Employee e WHERE e.department = ?1 AND YEAR(e.hiredate) = ?2")
    List<Employee> findEmployees(String department, int year);

}
