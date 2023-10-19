package ru.skypro.lesson.EmployeeApplicationTesting.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.skypro.lesson.EmployeeApplicationTesting.pojo.ReportWithPath;

import java.util.List;
import java.util.Optional;

@Repository
public interface ReportWithPathRepository extends CrudRepository<ReportWithPath, Integer> {

    List<ReportWithPath> findAll();

    @Override
    Optional<ReportWithPath> findById(Integer integer);
}