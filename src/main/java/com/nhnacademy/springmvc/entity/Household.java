package com.nhnacademy.springmvc.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="household")
public class Household {

    @Id
    @Column(name = "household_serial_number")
    private Long householdSerialNumber;

    @Column(name = "household_resident_serial_number")
    private Long householdResidentSerialNumber;

    @Column(name = "household_composition_date")
    private LocalDate householdCompositionDate;

    @Column(name = "household_composition_reason_code")
    private String householdCompositionReasonCode;

    @Column(name = "current_house_movement_address")
    private String currentHouseMovementAddress;

    @ManyToOne
    @JoinColumn(name="resident_serial_number")
    private Resident resident;

}
