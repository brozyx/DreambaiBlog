package com.dreambai.blog.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by hang.zhao on 2019/1/29.
 */
@Repository
public interface UserMapper {

    String selectNickName(String userName);
}
