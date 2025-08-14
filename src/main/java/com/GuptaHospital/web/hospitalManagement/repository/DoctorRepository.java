package com.GuptaHospital.web.hospitalManagement.repository;

import com.GuptaHospital.web.hospitalManagement.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}