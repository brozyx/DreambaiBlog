package com.dreambai.blog.bean.request;

import com.dreambai.api.pojo.page.PageRequest;
import lombok.Data;

/**
 * Created by hang.zhao on 2019/1/27.
 */
@Data
public class BlogRequest extends PageRequest {

    private static final long serialVersionUID = 1L;

    int type = 0;

    String query = "";
}
