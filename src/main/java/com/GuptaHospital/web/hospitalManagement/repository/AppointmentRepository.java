package com.GuptaHospital.web.hospitalManagement.repository;

import com.GuptaHospital.web.hospitalManagement.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}