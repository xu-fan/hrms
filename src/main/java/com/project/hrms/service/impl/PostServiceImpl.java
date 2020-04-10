package com.project.hrms.service.impl;

import com.project.hrms.entity.Post;
import com.project.hrms.service.PostService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName PostServiceImpl
 * @Description TODO
 * @Author xufan
 * @Date 2020/04/10  14:43
 * @Version 1.0.0
 **/
@Service
public class PostServiceImpl implements PostService {

    @Override
    public List<Post> posts() {
        return null;
    }

    @Override
    public Post postByid(Integer postId) {
        return null;
    }

    @Override
    public Boolean save(Post post) {
        return null;
    }

    @Override
    public Boolean update(Post post) {
        return null;
    }

    @Override
    public Boolean delete(Integer postId) {
        return null;
    }
}
