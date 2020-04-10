package com.project.hrms.service;

import com.project.hrms.entity.Post;

import java.util.List;

/**
 * @ClassName PostService
 * @Description TODO
 * @Author xufan
 * @Date 2020/04/10  14:40
 * @Version 1.0.0
 **/
public interface PostService {

    List<Post> posts();

    Post postByid(Integer postId);

    Boolean save(Post post);

    Boolean update(Post post);

    Boolean delete(Integer postId);
}
