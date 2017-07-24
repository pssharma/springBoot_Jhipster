package com.computerworks.jhip.service.mapper;

import com.computerworks.jhip.domain.*;
import com.computerworks.jhip.service.dto.RegionDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Region and its DTO RegionDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface RegionMapper extends EntityMapper <RegionDTO, Region> {
    
    

}
