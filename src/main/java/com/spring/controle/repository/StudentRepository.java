package com.spring.controle.repository;

import com.spring.controle.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Employee, Long>{

}
