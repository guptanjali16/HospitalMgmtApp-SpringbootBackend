package com.GuptaHospital.web.hospitalManagement.controller;

import com.GuptaHospital.web.hospitalManagement.dto.AppointmentResponseDto;
import com.GuptaHospital.web.hospitalManagement.dto.CreateAppointmentRequestDto;
import com.GuptaHospital.web.hospitalManagement.dto.PatientResponseDto;
import com.GuptaHospital.web.hospitalManagement.service.AppointmentService;
import com.GuptaHospital.web.hospitalManagement.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientController {

    private final PatientService patientService;
    private final AppointmentService appointmentService;

    @PostMapping("/appointments")
    public ResponseEntity<AppointmentResponseDto> createNewAppointment(@RequestBody CreateAppointmentRequestDto createAppointmentRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(appointmentService.createNewAppointment(createAppointmentRequestDto));
    }

    @GetMapping("/profile")
    private ResponseEntity<PatientResponseDto> getPatientProfile() {
        Long patientId = 4L;
        return ResponseEntity.ok(patientService.getPatientById(patientId));
    }

}
