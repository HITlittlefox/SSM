package com.lxl.dao;

import com.lxl.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    //新增一个博客
    int addBlog(Blog blog);

    //需求,测试if
    List<Blog> queryBlogIf(Map map);

    //需求,测试Set
    int updateBlog(Map map);

    //需求,测试choose
    List<Blog> queryBlogChoose(Map map);


    //需求,测试sql片段
    List<Blog> queryBlogIf2(Map map);

    //需求,测试foreach
    List<Blog> queryBlogForeach(Map map);


}