package com.ComprehensiveAssesment.HospitalManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ComprehensiveAssesment.HospitalManagement.Entity.Doctor;

@Repository
public interface DoctorRepo extends JpaRepository<Doctor, Long>{

}
