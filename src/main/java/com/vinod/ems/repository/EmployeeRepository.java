package com.vinod.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vinod.ems.entity.EmployeEntity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeEntity, Long> {

}