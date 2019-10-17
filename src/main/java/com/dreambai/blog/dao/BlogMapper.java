package com.dreambai.blog.dao;

import com.dreambai.blog.bean.Blog;
import com.dreambai.blog.bean.BlogType;
import com.dreambai.blog.bean.request.BlogRequest;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by hang.zhao on 2019/1/25.
 */
@Repository
public interface BlogMapper {

    int getTotal(BlogRequest request);

    List<Blog> selectBlogs(BlogRequest request);

    List<BlogType> queryBlogTypes();




}
