package com.computerworks.jhip.repository;

import com.computerworks.jhip.domain.Country;
import org.springframework.stereotype.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the Country entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CountryRepository extends MongoRepository<Country,String> {
    
}
