package com.GuptaHospital.web.hospitalManagement.repository;

import com.GuptaHospital.web.hospitalManagement.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}