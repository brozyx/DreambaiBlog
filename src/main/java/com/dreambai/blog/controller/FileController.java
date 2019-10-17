package com.dreambai.blog.controller;

import com.dreambai.annotation.JsonResponseBody;
import com.dreambai.api.pojo.JsonResult;
import com.dreambai.blog.biz.BlogBiz;
import com.dreambai.blog.biz.FileBiz;
import com.dreambai.blog.common.Constant;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Objects;

/**
 * Created by hang.zhao on 2019/1/30.
 */
@RestController
@JsonResponseBody
@RequestMapping(Constant.PATH_PREFIX + "/file")
public class FileController {

	@Resource
	FileBiz fileBiz;

	@PostMapping("/updata/v1")
	public JsonResult<String> updataFile(HttpServletRequest httpServletRequest,
	                                     @RequestParam("file") MultipartFile multipartFile) {
		return JsonResult.success(fileBiz.updataFile(httpServletRequest,multipartFile));
	}
}
