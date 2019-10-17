package com.dreambai.blog.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by hang.zhao on 2019/1/28.
 */
@Data
public class BlogVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String title; // 博客标题
    private String content; // 博客内容
    private String created_by;//创建人
    private Integer click_hit;// 查看次数
    private Integer reply_hit;//回复次数
    private String created_time;//创建时间
}
