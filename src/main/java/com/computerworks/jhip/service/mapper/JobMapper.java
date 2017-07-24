package com.computerworks.jhip.service.mapper;

import com.computerworks.jhip.domain.*;
import com.computerworks.jhip.service.dto.JobDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Job and its DTO JobDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface JobMapper extends EntityMapper <JobDTO, Job> {
    
    

}
