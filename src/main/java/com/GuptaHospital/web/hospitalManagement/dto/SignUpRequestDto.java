package com.GuptaHospital.web.hospitalManagement.dto;

import com.GuptaHospital.web.hospitalManagement.entity.type.RoleType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpRequestDto {
    private String username;
    private String password;
    private String name;

    private Set<RoleType> roles = new HashSet<>();
}
