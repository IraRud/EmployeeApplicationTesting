package ru.skypro.lesson.EmployeeApplicationTesting.controller;

import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.lesson.EmployeeApplicationTesting.service.EmployeeService;
import ru.skypro.lesson.EmployeeApplicationTesting.service.ReportWithPathService;

@RestController
@RequestMapping("/reportWithPath")
public class ReportWithPathController {
    private final ReportWithPathService reportWithPathService;
    private final EmployeeService employeeService;

    public ReportWithPathController(ReportWithPathService reportWithPathService, EmployeeService employeeService) {
        this.reportWithPathService = reportWithPathService;
        this.employeeService = employeeService;
    }

    @PostMapping("/")
    public Integer getReport() {
        return reportWithPathService.addReportWithPath();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public ResponseEntity<Resource> getReportById(@PathVariable Integer id) {
        return reportWithPathService.getReportWithPathById(id);
    }
}