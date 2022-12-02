package com.nhnacademy.resident.service;

import com.nhnacademy.resident.repository.ResidentRepository;
import com.nhnacademy.resident.entity.Resident;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("residentService")
public class ResidentServiceImpl implements ResidentService {
    private final ResidentRepository residentRepository;

    public ResidentServiceImpl(ResidentRepository residentRepository) {
        this.residentRepository = residentRepository;
    }

    @Override
    public Resident getResident(Long residentId) {
        return residentRepository.findById(residentId).orElse(null);
    }

    @Transactional
    @Override
    public Resident createResident(Resident resident) {
        return residentRepository.save(resident);
    }
}
