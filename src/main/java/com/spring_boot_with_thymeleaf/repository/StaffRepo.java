package com.spring_boot_with_thymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring_boot_with_thymeleaf.entity.Staff;
public interface StaffRepo extends JpaRepository<Staff,
        Integer> {
}

