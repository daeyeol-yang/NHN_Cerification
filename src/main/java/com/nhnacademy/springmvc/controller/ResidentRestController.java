package com.nhnacademy.springmvc.controller;

import com.nhnacademy.springmvc.domain.ResidentModifyRequest;
import com.nhnacademy.springmvc.entity.Resident;
import com.nhnacademy.springmvc.exception.ResidentNotFoundException;
import com.nhnacademy.springmvc.exception.ValidationFailedException;
import com.nhnacademy.springmvc.service.ResidentService;
import java.util.Objects;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/residents/{residentId}")
public class ResidentRestController {
    private final ResidentService residentService;

    public ResidentRestController(ResidentService residentService) {
        this.residentService = residentService;
    }

    @ModelAttribute(value = "resident", binding = false)
    public Resident getResident(@PathVariable("residentId") Long residentId){

        Resident resident = residentService.getResident(residentId);
        if(Objects.isNull(resident)){
            throw new ResidentNotFoundException();
        }

        return resident;
    }

    @GetMapping
    public Resident getResident(@ModelAttribute("resident") Resident resident){
        return resident;}


    @PutMapping
    public Resident modifyResident(@ModelAttribute("resident") Resident resident,
                                   @RequestBody ResidentModifyRequest request, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            throw new ValidationFailedException(bindingResult);
        }

        resident.setName(request.getName());
        resident.setResidentRegistrationNumber(request.getResidentRegistrationNumber());
        resident.setGenderCode(request.getGenderCode());
        resident.setBirthDate(request.getBirthDate());
        resident.setBirthPlaceCode(request.getBirthPlaceCode());
        resident.setRegistrationBaseAddress(request.getRegistrationBaseAddress());
        resident.setDeathDate(request.getDeathDate());
        resident.setDeathPlaceCode(request.getDeathPlaceCode());
        resident.setDeathPlaceAddress(request.getDeathPlaceAddress());

        return residentService.modifyResident(resident);
    }
}
