package com.computerworks.jhip.repository;

import com.computerworks.jhip.domain.Department;
import org.springframework.stereotype.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the Department entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DepartmentRepository extends MongoRepository<Department,String> {
    
}
