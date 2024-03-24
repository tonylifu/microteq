package com.microteq.student.mapper;

import com.microteq.api.dto.request.student.CreateStudentRequest;
import com.microteq.api.services.AppUtil;
import com.microteq.service.util.AuthServiceUtil;
import com.microteq.student.entity.student.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CreateStudentRequestToStudentMapper {
    CreateStudentRequestToStudentMapper INSTANCE = Mappers.getMapper(CreateStudentRequestToStudentMapper.class);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "lastUpdateAt", ignore = true)
    @Mapping(target = "studentStatus", ignore = true)
    @Mapping(target = "dob", source = "dob", dateFormat = "yyyy-MM-dd", qualifiedByName = "localDateStringToLong")
    @Mapping(target = "actionBy", expression = "java(mapUserFromSecurityContext())")
    @Mapping(target = "lastActionBy", expression = "java(mapUserFromSecurityContext())")
    Student toStudent(CreateStudentRequest createStudentRequest);

    @Named("localDateStringToLong")
    default long mapLocalDateStringToLong(String dob) {
        return AppUtil.convertLocalDateToLong(AppUtil.parseToLocalDate(dob));
    }

    default String mapUserFromSecurityContext() {
        return AuthServiceUtil.getUserFromSecurityContext();
    }
}