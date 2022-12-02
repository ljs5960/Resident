package com.nhnacademy.resident.repository;

import com.nhnacademy.resident.entity.Resident;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResidentRepository extends JpaRepository<Resident, Long> {
    // SELECT * FROM Resident WHERE name={name}
    List<Resident> findByName(String residentName);
}
