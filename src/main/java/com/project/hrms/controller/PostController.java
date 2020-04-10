package com.project.hrms.controller;

import com.project.hrms.entity.Post;
import com.project.hrms.service.PostService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName PostController
 * @Description 岗位管理器
 * @Author xufan
 * @Date 2020/04/10  14:02
 * @Version 1.0.0
 **/
@RequestMapping("/post")
@RestController
public class PostController {

    @Resource
    PostService postService;

    @GetMapping
    public List<Post> posts(){
        List<Post> posts = new ArrayList<>();
        posts = postService.posts();
        return posts;
    }

    @GetMapping("/${postId}")
    public Post posts(@PathVariable("postId")Integer postId){
        Post post = postService.postByid(postId);
        return post;
    }

    @PostMapping
    public String save(@RequestBody Post post){
        if(postService.save(post)){
            return "新增成功";
        }else {
            return "新增失败";
        }
    }

    @PutMapping
    public String update(@RequestBody Post post){
        if(postService.update(post)){
            return "更新成功";
        }else {
            return "更新失败";
        }
    }

    @DeleteMapping
    public String delete(@RequestParam("postId")Integer postId){
        if(postService.delete(postId)){
            return "删除成功";
        }else {
            return "删除失败";
        }
    }
}
