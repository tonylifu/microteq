package com.microteq.student.mapper;

import com.microteq.api.dto.request.student.CreateStudentRequest;
import com.microteq.student.entity.student.Student;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-24T16:40:23+0000",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.6.jar, environment: Java 21.0.2 (Azul Systems, Inc.)"
)
public class CreateStudentRequestToStudentMapperImpl implements CreateStudentRequestToStudentMapper {

    @Override
    public Student toStudent(CreateStudentRequest createStudentRequest) {
        if ( createStudentRequest == null ) {
            return null;
        }

        Student student = new Student();

        student.setDob( mapLocalDateStringToLong( createStudentRequest.getDob() ) );
        student.setStudentId( createStudentRequest.getStudentId() );
        student.setFirstName( createStudentRequest.getFirstName() );
        student.setMiddleName( createStudentRequest.getMiddleName() );
        student.setLastName( createStudentRequest.getLastName() );
        student.setGender( createStudentRequest.getGender() );
        student.setAddress( createStudentRequest.getAddress() );
        student.setContact( createStudentRequest.getContact() );
        student.setLegalGuardian( createStudentRequest.getLegalGuardian() );
        student.setCurrentGrade( createStudentRequest.getCurrentGrade() );
        student.setDisabled( createStudentRequest.isDisabled() );
        student.setDisabilityDetails( createStudentRequest.getDisabilityDetails() );

        student.setActionBy( mapUserFromSecurityContext() );
        student.setLastActionBy( mapUserFromSecurityContext() );

        return student;
    }
}
