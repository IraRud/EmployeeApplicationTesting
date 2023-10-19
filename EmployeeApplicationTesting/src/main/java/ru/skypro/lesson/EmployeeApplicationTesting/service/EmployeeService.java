package ru.skypro.lesson.EmployeeApplicationTesting.service;

import org.springframework.web.multipart.MultipartFile;
import ru.skypro.lesson.EmployeeApplicationTesting.DTO.EmployeeDTO;
import ru.skypro.lesson.EmployeeApplicationTesting.DTO.EmployeeFullInfo;
import ru.skypro.lesson.EmployeeApplicationTesting.DTO.EmployeeReport;

import java.util.List;

public interface EmployeeService {
    List<EmployeeFullInfo> getAllEmployees();

    int getSumSalary();

    EmployeeFullInfo getMaxSalary();

    EmployeeFullInfo getMinSalary();

    List<EmployeeFullInfo> getEmployeeWithSalaryAboveAverage();

    EmployeeDTO getEmployeeById(Integer id);

    List<EmployeeFullInfo> getEmployeesWithSalaryHigherThan(Integer compareSalary);

    void deleteEmployeeById(Integer id);

    void editEmployee(EmployeeDTO employeeDTO);
    void addEmployee(EmployeeDTO employeeDTO);
    EmployeeDTO getTheHighestSalary();

    List<EmployeeFullInfo> getEmployeeByPosition(Integer position);

    List<EmployeeDTO> getEmployeeWithPaging(Integer page);
    EmployeeFullInfo getEmployeeByIdFullInfo(Integer id);

    List<EmployeeReport> getReport();

    EmployeeDTO uploadEmployeeFromFile(MultipartFile file);

    void addEmployeeFromFile(MultipartFile file);
}