package com.microteq.api.dto.response.student;

import com.microteq.api.dto.Address;
import com.microteq.api.dto.Contact;
import com.microteq.api.dto.LegalGuardian;
import com.microteq.api.enums.Gender;
import com.microteq.api.enums.StudentStatus;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentResponse {
    private String studentId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String dob;
    private Gender gender;
    private StudentStatus studentStatus;
    private Address address;
    private Contact contact;
    private LegalGuardian legalGuardian;
    private String currentGrade;
    private boolean disabled;
    private String disabilityDetails;
    private String actionBy;
    private String lastActionBy;
}
