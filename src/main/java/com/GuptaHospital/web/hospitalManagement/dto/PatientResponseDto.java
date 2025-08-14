package com.GuptaHospital.web.hospitalManagement.dto;

import com.GuptaHospital.web.hospitalManagement.entity.type.BloodGroupType;
import lombok.Data;

import java.time.LocalDate;

@Data
public class PatientResponseDto {
    private Long id;
    private String name;
    private String gender;
    private LocalDate birthDate;
    private BloodGroupType bloodGroup;
}
