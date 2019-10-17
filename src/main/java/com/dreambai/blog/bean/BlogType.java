package com.dreambai.blog.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 博客类型实体
 * @author Administrator
 *
 */
@Data
public class BlogType implements Serializable{


    private static final long serialVersionUID = 1L;

    private String type_name; // 博客类型名称
    private int index; // 排序  从小到大排序显示

}
