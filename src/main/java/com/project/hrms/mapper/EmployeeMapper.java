package com.project.hrms.mapper;

import com.project.hrms.entity.Employee;
import com.project.hrms.entity.Post;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmployeeMapper {
    Employee employeeByid(Integer eId);

    boolean save(Employee employee);

    boolean update(Employee employee);

    boolean delete(Integer eId);

    List<Employee> employees();
}
