package ru.skypro.lesson.EmployeeApplicationTesting.service;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;

public interface ReportWithPathService {
    Integer addReportWithPath();

    ResponseEntity<Resource> getReportWithPathById(Integer id);
}
