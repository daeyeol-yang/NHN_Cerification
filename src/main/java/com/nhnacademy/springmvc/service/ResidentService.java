package com.nhnacademy.springmvc.service;

import com.nhnacademy.springmvc.entity.Resident;
import java.time.LocalDateTime;
import javax.persistence.Column;

public interface ResidentService {

    Resident getResident(Long residentSerialNumber);

    Resident createResident(Long residentSerialNumber,String name,String residentRegistraionNumber,String genderCode,LocalDateTime birthDate,String birthPlaceCode,String registrationBaseAdress, LocalDateTime deathDate,String deathPlaceCode,String deathPlaceAddress);

    Resident modifyResident(Resident resident);
}


//    @Column(name = "resident_serial_number")
//    private Long residentSerialNumber;
//
//    @Column(name = "name")
//    private String name;
//
//    @Column(name = "resident_registration_number")
//    private String residentRegistraionNumber;
//
//    @Column(name = "gender_code")
//    private String genderCode;
//
//    @Column(name = "birth_date")
//    private LocalDateTime birthDate;
//
//    @Column(name = "birth_place_code")
//    private String birthPlaceCode;
//
//    @Column(name = "registration_base_address")
//    private String registrationBaseAdress;
//
//    @Column(name = "death_date")
//    private LocalDateTime deathDate;
//
//    @Column(name = "death_place_code")
//    private String deathPlaceCode;
//
//    @Column(name = "death_place_address")
//    private String deathPlaceAddress;