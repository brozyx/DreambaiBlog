package com.dreambai.blog.controller;


import com.dreambai.api.pojo.JsonResult;
import com.dreambai.api.pojo.page.Pager;

import com.dreambai.blog.bean.BlogType;
import com.dreambai.blog.bean.BlogVo;
import com.dreambai.blog.bean.request.BlogRequest;
import com.dreambai.blog.biz.BlogBiz;

import com.dreambai.blog.common.Constant;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by hang.zhao on 2019/1/24.
 * 博客Controller
 */
@RestController
@RequestMapping(Constant.PATH_PREFIX)
public class BlogController {

    @Resource
    BlogBiz blogBiz;

    //博客列表  分类检索  模糊搜索
    @PostMapping("/list/v1")
    public Pager<BlogVo> blogs(@RequestBody BlogRequest req) {
        return blogBiz.blogs(req);
    }

    //所有博客分类
    @GetMapping("/types")
    public JsonResult<List<BlogType>> blogTypeList() {
        return JsonResult.success(blogBiz.blogTypes());

    }


}

