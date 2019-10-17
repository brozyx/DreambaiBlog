package com.dreambai.blog.biz;


import com.dreambai.biz.lang.Biz;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Objects;

@Biz
public class FileBiz {

	public String updataFile(HttpServletRequest httpServletRequest, MultipartFile multipartFile) {

		if (Objects.nonNull(multipartFile) &&
				!multipartFile.isEmpty()) {
			String filePath = "/home/wwwroot/img/" + multipartFile.getOriginalFilename();
			if (httpServletRequest.getRequestURL().toString().contains("localhost") ||
					httpServletRequest.getRequestURL().toString().contains("127.0.0.1")) {
				filePath = "/Users/zhaohang/" + multipartFile.getOriginalFilename();
			}
			try {

				multipartFile.transferTo(new File(filePath));
			} catch (Exception e) {
				throw new AssertionError(e);
			}
			return "上传完了";
		}
		return "没文件上传个毛线";
	}
}
