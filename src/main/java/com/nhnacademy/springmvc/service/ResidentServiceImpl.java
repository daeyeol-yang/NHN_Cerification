package com.nhnacademy.springmvc.service;

import com.nhnacademy.springmvc.entity.Resident;
import com.nhnacademy.springmvc.repository.ResidentRepository;
import java.time.LocalDateTime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service("residentService")
public class ResidentServiceImpl implements ResidentService {

    private final ResidentRepository residentRepository;

    public ResidentServiceImpl(ResidentRepository residentRepository) {
        this.residentRepository = residentRepository;
    }
    @Override
    public Resident getResident(Long residentSerialNumber) {
        log.info("getResident실행");
        return residentRepository.findById(residentSerialNumber).orElse(null);
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
