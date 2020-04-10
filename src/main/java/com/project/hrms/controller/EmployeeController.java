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
    public List<Employee> posts(){

        List<Employee> employees=employeeMapper.posts();
        return posts;

    }

    @GetMapping("/${postId}")
    public Post posts(@PathVariable("postId")Integer postId){
        Post post = employeeMapper.postByid(postId);
        return post;
    }

    @PostMapping
    public String save(@RequestBody Post post){
        if(employeeMapper.save(post)){
            return "新增成功";
        }else {
            return "新增失败";
        }
    }

    @PutMapping
    public String update(@RequestBody Post post){
        if(employeeMapper.update(post)){
            return "更新成功";
        }else {
            return "更新失败";
        }
    }

    @DeleteMapping
    public String delete(@RequestParam("postId")Integer postId){
        if(employeeMapper.delete(postId)){
            return "删除成功";
        }else {
            return "删除失败";
        }
    }


}
