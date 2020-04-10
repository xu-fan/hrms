package com.project.hrms.service.impl;

import com.project.hrms.entity.Post;
import com.project.hrms.mapper.PostMapper;
import com.project.hrms.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;
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

    @Resource
    PostMapper postMapper;

    @Override
    public List<Post> posts() {
        return postMapper.post();
    }

    @Override
    public Post postByid(Integer postId) {
        return postMapper.selectByid(postId);
    }

    @Override
    public Boolean save(Post post) {
        return postMapper.save(post)>0;
    }

    @Override
    public Boolean update(Post post) {
        return postMapper.update(post)>0;
    }

    @Override
    public Boolean delete(Integer postId) {
        return postMapper.delete(postId)>0;
    }
}
