package ru.skypro.lesson.EmployeeApplicationTesting.service;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;

public interface ReportService {
    Integer addReport();
    ResponseEntity<Resource> getReportById(Integer id);
}
