package com.dreambai.blog.controller;

import com.dreambai.annotation.JsonResponseBody;
import com.dreambai.api.pojo.JsonResult;
import com.dreambai.blog.bean.Link;
import com.dreambai.blog.biz.LinkBiz;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by hang.zhao on 2019/1/26.
 */

@RestController
@JsonResponseBody
@RequestMapping("/decode")
public class LinkController {

    @Resource
    LinkBiz linkBiz;

    @GetMapping("/list")
    public JsonResult<List<Link>> LinkList(){

        return JsonResult.success(linkBiz.allLinkList());
    }

}
