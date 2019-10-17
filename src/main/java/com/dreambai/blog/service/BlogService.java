package com.dreambai.blog.service;

import com.dreambai.blog.bean.Blog;
import com.dreambai.blog.bean.BlogType;
import com.dreambai.blog.bean.request.BlogRequest;
import com.dreambai.blog.dao.BlogMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by hang.zhao on 2019/1/25.
 */
@Service
public class BlogService {

    @Resource
    private BlogMapper blogMapper;

    public int getTotal(BlogRequest query) {
        return blogMapper.getTotal(query);
    }

    public List<Blog> blogs(BlogRequest req) {
        return blogMapper.selectBlogs(req);

    }

    public List<BlogType> queryBlogTypes(){
        return blogMapper.queryBlogTypes();
    }

}