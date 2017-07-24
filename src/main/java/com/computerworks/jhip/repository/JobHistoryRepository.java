package com.computerworks.jhip.repository;

import com.computerworks.jhip.domain.JobHistory;
import org.springframework.stereotype.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the JobHistory entity.
 */
@SuppressWarnings("unused")
@Repository
public interface JobHistoryRepository extends MongoRepository<JobHistory,String> {
    
}
