package com.project.hrms.mapper;

import com.project.hrms.entity.Employee;
import com.project.hrms.entity.Post;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmployeeMapper {
    Post postByid(Integer postId);

    boolean save(Post post);

    boolean update(Post post);

    boolean delete(Integer postId);

    List<Employee> posts();
}
