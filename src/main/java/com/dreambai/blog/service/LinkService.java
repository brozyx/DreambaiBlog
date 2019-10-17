package com.dreambai.blog.service;

import com.dreambai.blog.bean.Link;
import com.dreambai.blog.dao.LinkMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by hang.zhao on 2019/1/26.
 */
@Service
public class LinkService {

    @Resource
    LinkMapper linkMapper;

    public List<Link> allLinkList() {
        return linkMapper.allLinkList();
    }


}
