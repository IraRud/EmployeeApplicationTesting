package ru.skypro.lesson.EmployeeApplicationTesting.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import ru.skypro.lesson.EmployeeApplicationTesting.pojo.Employee;

public interface EmployeePagingAndSortingRepository extends PagingAndSortingRepository<Employee, Integer> {
}
