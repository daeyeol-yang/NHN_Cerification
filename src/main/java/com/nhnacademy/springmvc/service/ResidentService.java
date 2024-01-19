package com.nhnacademy.springmvc.service;

import com.nhnacademy.springmvc.entity.Resident;
import java.time.LocalDateTime;

public interface ResidentService {

    Resident getResident(Long residentSerialNumber);

    Resident createResident(Long residentSerialNumber,String name,String residentRegistraionNumber,String genderCode,LocalDateTime birthDate,String birthPlaceCode,String registrationBaseAdress, LocalDateTime deathDate,String deathPlaceCode,String deathPlaceAddress);

    Resident modifyResident(Resident resident);
}

