package com.example.jsp.utils.execption;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 橙鼠鼠
 */
@Component
@Getter
public class ErrorInfo {
	private static final Map<String, String> INFO = new HashMap<>(16);

	static {
		//注册
		INFO.put("301", "用户名已存在,无法注册");
		INFO.put("302", "创建Deliver时,对应的User未能创建成功");
		INFO.put("303", "创建Store时,对应的User没有创建成功");
		INFO.put("304", "创建Store时,对应的User没有创建成功");
		INFO.put("305", "创建Product时,没有对应的Store");
		//登录错误:5
		//鉴权错误:6
	}

	private ErrorInfo () {
	}

	public static Map<String, String> getInfo () {
		return INFO;
	}
}
