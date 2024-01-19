package com.nhnacademy.springmvc.controller;

import com.nhnacademy.springmvc.entity.Resident;
import com.nhnacademy.springmvc.exception.ResidentNotFoundException;
import com.nhnacademy.springmvc.service.ResidentService;
import java.util.Objects;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
        log.info("1st line");

        Resident resident = residentService.getResident(residentId);
        if(Objects.isNull(resident)){
            throw new ResidentNotFoundException();
        }

        log.info("getResident");
        log.info("resident: {}", resident);

        return resident;
    }

    @GetMapping
    public Resident getResident(@ModelAttribute("resident") Resident resident){
        log.info("getResident 실행");
        return resident;}
}
