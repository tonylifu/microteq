package com.microteq.student.mapper;

import com.microteq.api.dto.response.student.StudentResponse;
import com.microteq.api.dto.response.student.StudentResponse.StudentResponseBuilder;
import com.microteq.student.entity.student.Student;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-24T16:40:23+0000",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.6.jar, environment: Java 21.0.2 (Azul Systems, Inc.)"
)
public class StudentToStudentResponseMapperImpl implements StudentToStudentResponseMapper {

    @Override
    public StudentResponse toStudentResponse(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentResponseBuilder studentResponse = StudentResponse.builder();

        studentResponse.dob( mapLongToLocalDateString( student.getDob() ) );
        studentResponse.studentId( student.getStudentId() );
        studentResponse.firstName( student.getFirstName() );
        studentResponse.middleName( student.getMiddleName() );
        studentResponse.lastName( student.getLastName() );
        studentResponse.gender( student.getGender() );
        studentResponse.studentStatus( student.getStudentStatus() );
        studentResponse.address( student.getAddress() );
        studentResponse.contact( student.getContact() );
        studentResponse.legalGuardian( student.getLegalGuardian() );
        studentResponse.currentGrade( student.getCurrentGrade() );
        studentResponse.disabled( student.isDisabled() );
        studentResponse.disabilityDetails( student.getDisabilityDetails() );
        studentResponse.actionBy( student.getActionBy() );
        studentResponse.lastActionBy( student.getLastActionBy() );

        return studentResponse.build();
    }
}
