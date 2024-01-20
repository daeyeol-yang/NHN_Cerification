package com.nhnacademy.springmvc.domain;

public class ResidentsNameOnly implements ResidentNameOnly {
    private String name;

    public ResidentsNameOnly(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
