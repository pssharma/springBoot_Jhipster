package com.computerworks.jhip.service.mapper;

import com.computerworks.jhip.domain.*;
import com.computerworks.jhip.service.dto.EmployeeDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Employee and its DTO EmployeeDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface EmployeeMapper extends EntityMapper <EmployeeDTO, Employee> {
    
    

}
