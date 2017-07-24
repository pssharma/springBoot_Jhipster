package com.computerworks.jhip.service.mapper;

import com.computerworks.jhip.domain.*;
import com.computerworks.jhip.service.dto.LocationDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Location and its DTO LocationDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface LocationMapper extends EntityMapper <LocationDTO, Location> {
    
    

}
