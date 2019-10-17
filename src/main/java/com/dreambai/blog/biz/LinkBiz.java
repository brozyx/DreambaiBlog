package com.dreambai.blog.biz;

import com.dreambai.biz.BizTemplate;
import com.dreambai.biz.lang.Biz;
import com.dreambai.blog.bean.Link;
import com.dreambai.blog.service.LinkService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by hang.zhao on 2019/1/26.
 */
@Biz
public class LinkBiz {

    private Logger logger = LoggerFactory.getLogger(LinkBiz.class);


    @Resource
    LinkService linkService;

    public List<Link> allLinkList() {
        return linkService.allLinkList();
    }
}


