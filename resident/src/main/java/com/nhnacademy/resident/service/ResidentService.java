package com.nhnacademy.resident.service;

import com.nhnacademy.resident.entity.Resident;

public interface ResidentService {
    Resident getResident(Long residentId);

    Resident createResident(Resident resident);
}
