package com.nhnacademy.springmvc.service;

import com.nhnacademy.springmvc.entity.Resident;
import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

@Service("residentService")
public class ResidentServiceImpl implements ResidentService {
    @Override
    public Resident getResident(Long residentSerialNumber) {
        return null;
    }

    @Override
    public Resident createResident(Long residentSerialNumber, String name, String residentRegistraionNumber,
                                   String genderCode, LocalDateTime birthDate, String birthPlaceCode,
                                   String registrationBaseAdress, LocalDateTime deathDate, String deathPlaceCode,
                                   String deathPlaceAddress) {
        return null;
    }

    @Override
    public Resident modifyResident(Resident resident) {
        return null;
    }
}
