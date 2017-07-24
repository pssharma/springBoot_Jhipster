package com.computerworks.jhip.service.mapper;

import com.computerworks.jhip.domain.*;
import com.computerworks.jhip.service.dto.JobHistoryDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity JobHistory and its DTO JobHistoryDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface JobHistoryMapper extends EntityMapper <JobHistoryDTO, JobHistory> {
    
    

}
