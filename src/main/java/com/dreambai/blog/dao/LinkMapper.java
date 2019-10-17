package com.dreambai.blog.dao;

import com.dreambai.blog.bean.Link;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hang.zhao on 2019/1/26.
 */
@Repository
public interface LinkMapper {

    List<Link> allLinkList();


}
