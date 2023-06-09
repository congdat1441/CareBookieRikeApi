package com.spring.carebookie.common.mappers;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;
import static org.mapstruct.ReportingPolicy.IGNORE;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.spring.carebookie.dto.HospitalSaveDto;
import com.spring.carebookie.entity.HospitalEntity;

@Mapper(unmappedTargetPolicy = IGNORE, nullValueCheckStrategy = ALWAYS)
public interface HospitalMapper {

    HospitalMapper INSTANCE = Mappers.getMapper(HospitalMapper.class);

    HospitalEntity convertSaveDtoToEntity(HospitalSaveDto dto);

}
