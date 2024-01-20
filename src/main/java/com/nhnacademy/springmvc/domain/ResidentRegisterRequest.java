package com.nhnacademy.springmvc.domain;

import java.util.Date;
import lombok.Data;

@Data
public class ResidentRegisterRequest {

        private String name;

        private String residentRegistrationNumber;

        private String genderCode;

        private Date birthDate;

        private String birthPlaceCode;

        private String registrationBaseAddress;

        private Date deathDate;

        private String deathPlaceCode;

        private String deathPlaceAddress;

}
