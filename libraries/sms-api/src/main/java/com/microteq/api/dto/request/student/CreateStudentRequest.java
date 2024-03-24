package com.microteq.api.dto.request.student;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.microteq.api.dto.Address;
import com.microteq.api.dto.Contact;
import com.microteq.api.dto.LegalGuardian;
import com.microteq.api.enums.Gender;
import lombok.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateStudentRequest {
    private String studentId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String dob;
    private Gender gender;
    private Address address;
    private Contact contact;
    private LegalGuardian legalGuardian;
    @NotEmpty(message = "currentGrade must not be blank")
    @NotNull
    private String currentGrade;
    private boolean isDisabled;
    private String disabilityDetails;
}
