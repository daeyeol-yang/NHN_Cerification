package com.nhnacademy.springmvc.service;

import com.nhnacademy.springmvc.domain.ResidentNameOnly;
import com.nhnacademy.springmvc.entity.Resident;
import java.util.Date;
import java.util.List;

public interface ResidentService {

    Resident getResident(Long residentSerialNumber);

    Resident createResident( String name, String residentRegistraionNumber, String genderCode, Date birthDate, String birthPlaceCode, String registrationBaseAdress, Date deathDate, String deathPlaceCode, String deathPlaceAddress);

    Resident modifyResident(Resident resident);

    List<ResidentNameOnly> getAllResidentNames();

    List<Resident> getAllResident();
}

