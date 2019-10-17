package com.dreambai.blog.service;

import com.dreambai.blog.dao.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by hang.zhao on 2019/1/29.
 */
@Service
public class UserService {

    @Resource
    UserMapper userMapper;

    public String selectNickName(String userName) {
        return userMapper.selectNickName(userName);
    }

}


