package com.nhnacademy.springmvc.controller;

import com.nhnacademy.springmvc.entity.Resident;
import com.nhnacademy.springmvc.exception.ResidentNotFoundException;
import com.nhnacademy.springmvc.repository.ResidentRepository;
import com.nhnacademy.springmvc.service.ResidentService;
import java.util.List;
import java.util.Objects;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ResidentHomeController {


    @GetMapping("/")
    public String index() { return "ResidentMain";}


    private final ResidentService residentService;

    public ResidentHomeController(ResidentService residentService) {
        this.residentService = residentService;
    }

    @ModelAttribute(value = "residents", binding = false)
    public List<Resident> getAllResident(){

        List<Resident> allResidents = residentService.getAllResident();

        return allResidents;
    }


}
