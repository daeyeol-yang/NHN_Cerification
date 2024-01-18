package com.nhnacademy.springmvc.entity;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "household_movement_address")
public class HouseholdMovementAdress {

    @EmbeddedId
    private Pk pk;

    @Column(name = "house_movement_address")
    private String houseMovementAddress;

    @Column(name = "last_address_yn")
    private String lastAddressYn;

    @ManyToOne
    @MapsId("householdSerialNumber")
    @JoinColumn(name = "household_serial_number")
    private Household household;

    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public static class Pk implements Serializable {

        @Column(name = "household_serial_number")
        private Long householdSerialNumber;

        @Column(name = "house_movement_report_date")
        private LocalDate houseMovementReportDate;

    }


}
