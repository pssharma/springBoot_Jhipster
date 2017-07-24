package com.computerworks.jhip.repository;

import com.computerworks.jhip.domain.Job;
import org.springframework.stereotype.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the Job entity.
 */
@SuppressWarnings("unused")
@Repository
public interface JobRepository extends MongoRepository<Job,String> {
    
}
