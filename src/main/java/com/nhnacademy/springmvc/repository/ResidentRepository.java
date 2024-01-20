package com.nhnacademy.springmvc.repository;

import com.nhnacademy.springmvc.domain.ResidentNameOnly;
import com.nhnacademy.springmvc.entity.Resident;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResidentRepository extends JpaRepository<Resident,Long> {


}
