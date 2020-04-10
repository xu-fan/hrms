package com.project.hrms.mapper;

import com.project.hrms.entity.Post;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @ClassName PostMapper
 * @Description TODO
 * @Author xufan
 * @Date 2020/04/10  14:46
 * @Version 1.0.0
 **/
@Mapper
public interface PostMapper {


    @Select("SELECT * FROM post")
    List<Post> post();

    @Select("SELECT * FROM post WHERE p_id = #{postId}")
    Post selectByid(Integer postId);

    @Insert("INSERT INTO post(p_name, d_id, p_supid) VALUES (#{pName}, #{dId}, #{pSupid})")
    Integer save(Post post);

    @Update("UPDATE post SET p_name = #{pName},d_id = #{dId},p_supid = #{pSupid} WHERE p_id = #{pId}")
    Integer update(Post post);

    @Delete("DELETE FROM post WHERE p_id = #{pId}")
    Integer delete(Integer postId);
}
