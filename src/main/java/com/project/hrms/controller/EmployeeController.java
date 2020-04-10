package com.project.hrms.controller;

import com.project.hrms.entity.Employee;
import com.project.hrms.entity.Post;
import com.project.hrms.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/Employee")
@RestController
public class EmployeeController {

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping
    public List<Employee> employees(){

        List<Employee> employees=employeeMapper.employees();
        return employees;

    }

    @GetMapping("/${eId}")
    public Employee posts(@PathVariable("eId")Integer eId){
        Employee employee = employeeMapper.employeeByid(eId);
        return employee;
    }

    @PostMapping
    public String save(@RequestBody Employee employee){
        if(employeeMapper.save(employee)){
            return "新增成功";
        }else {
            return "新增失败";
        }
    }

    @PutMapping
    public String update(@RequestBody Employee employee){
        if(employeeMapper.update(employee)){
            return "更新成功";
        }else {
            return "更新失败";
        }
    }

    @DeleteMapping
    public String delete(@RequestParam("eId")Integer eId){
        if(employeeMapper.delete(eId)){
            return "删除成功";
        }else {
            return "删除失败";
        }
    }


}
