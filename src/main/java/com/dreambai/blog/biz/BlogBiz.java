package com.dreambai.blog.biz;

import com.dreambai.api.pojo.page.Pager;
import com.dreambai.biz.lang.Biz;
import com.dreambai.blog.bean.Blog;

import com.dreambai.blog.bean.BlogType;
import com.dreambai.blog.bean.BlogVo;
import com.dreambai.blog.bean.request.BlogRequest;
import com.dreambai.blog.service.BlogService;
import com.dreambai.blog.service.UserService;
import com.dreambai.common.util.Safes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by hang.zhao on 2019/1/24.
 */
@Biz
public class BlogBiz {

    private Logger logger = LoggerFactory.getLogger(getClass());


    @Resource
    BlogService blogService;

    @Resource
    UserService userService;

    private int totalCount;


    public Pager<BlogVo> blogs(BlogRequest req) {
        req.getPage().setPageSize(10);
        totalCount = blogService.getTotal(req);
        logger.info("totalCount:",totalCount);
        if (totalCount == 0) {
            return new Pager<>(
                    new Pager.PageData(req.getPage().getPageNo(), req.getPage().getPageSize(), totalCount),
                    Collections.emptyList());
        }

        List<BlogVo> resultData = Safes.of(blogService.blogs(req))
                .stream().map(this::adapter)
                .collect(Collectors.toList());
        return new Pager<>(
                new Pager.PageData(req.getPage().getPageNo(), req.getPage().getPageSize(), totalCount),
                resultData);
    }

    public List<BlogType> blogTypes() {
        return blogService.queryBlogTypes();
    }

    private BlogVo adapter(Blog blog) {
        if (Objects.isNull(blog)) {
            return null;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        BlogVo blogVo = new BlogVo();
        blogVo.setTitle(blog.getTitle());
        blogVo.setContent(blog.getContent());
        blogVo.setCreated_time(sdf.format(blog.getCreated_time()));
        blogVo.setCreated_by(blog.getCreated_by());
       // blogVo.setCreated_by(userService.selectNickName(blog.getCreated_by()));
        blogVo.setReply_hit(blog.getReply_hit());
        blogVo.setClick_hit(blog.getClick_hit());
        return blogVo;
    }
}
