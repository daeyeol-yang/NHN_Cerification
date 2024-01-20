package com.nhnacademy.springmvc.service;

import com.nhnacademy.springmvc.domain.ResidentNameOnly;
import com.nhnacademy.springmvc.domain.ResidentsNameOnly;
import com.nhnacademy.springmvc.entity.Resident;
import com.nhnacademy.springmvc.repository.ResidentRepository;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Transactional
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
    public Resident createResident( String name, String residentRegistrationNumber,
                                   String genderCode, Date birthDate, String birthPlaceCode,
                                   String registrationBaseAddress, Date deathDate, String deathPlaceCode,
                                   String deathPlaceAddress) {
        Resident newResident = new Resident();
        newResident.setName(name);
        newResident.setResidentRegistrationNumber(residentRegistrationNumber);
        newResident.setGenderCode(genderCode);
        newResident.setBirthDate(birthDate);
        newResident.setBirthPlaceCode(birthPlaceCode);
        newResident.setRegistrationBaseAddress(registrationBaseAddress);
        newResident.setDeathDate(deathDate);
        newResident.setDeathPlaceCode(deathPlaceCode);
        newResident.setDeathPlaceAddress(deathPlaceAddress);
        log.info("residentCreate:{}", newResident);


        return residentRepository.save(newResident);
    }

    @Override
    public Resident modifyResident(Resident resident) {
        return residentRepository.save(resident);
    }


    @Override
    public List<ResidentNameOnly> getAllResidentNames() {
        List<Resident> residents = residentRepository.findAll();
        return residents.stream()
                .map(resident -> new ResidentsNameOnly(resident.getName()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Resident> getAllResident() {
        return residentRepository.findAll();
    }
}
