package com.spring_boot_with_thymeleaf.service;

import java.util.List;
import com.spring_boot_with_thymeleaf.entity.Staff;
public interface StaffService {
    void save(Staff staff);
    List<Staff> getAll();
    Staff getById(Integer id);
    void delete(Staff staff);
}
