package com.nhnacademy.springmvc.controller;


import com.nhnacademy.springmvc.domain.ResidentRegisterRequest;
import com.nhnacademy.springmvc.entity.Resident;
import com.nhnacademy.springmvc.exception.ValidationFailedException;
import com.nhnacademy.springmvc.service.ResidentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/residents")
public class ResidentsRestController {
    private final ResidentService residentService;

    public ResidentsRestController(ResidentService residentService) {
        this.residentService = residentService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Resident createResident(@RequestBody ResidentRegisterRequest request, BindingResult bindingResult){
        log.info("createResident - Received request: {}", request);
        if(bindingResult.hasErrors()){
            throw new ValidationFailedException(bindingResult);
        }

        return residentService.createResident(request.getName(), request.getResidentRegistrationNumber(),
                request.getGenderCode(), request.getBirthDate() , request.getBirthPlaceCode(), request.getRegistrationBaseAddress(),request.getDeathDate(),
                request.getDeathPlaceCode(), request.getDeathPlaceAddress());
    }
}
