package com.dreambai.blog.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 博客实体
 *
 * @author Administrator
 */
@Data
public class Blog implements Serializable {

    private static final long serialVersionUID = 1L;

    private String title; // 博客标题
    private String content; // 博客内容
    private Integer blog_type; //integer 博客类型
    private Integer status; //状态
    private String created_by;//创建人
    private String last_modified; //最后更新人
    private Integer click_hit;// 查看次数
    private Integer reply_hit;//回复次数
    private Date created_time;//创建时间
    private Date update_time;//更新时间


}
