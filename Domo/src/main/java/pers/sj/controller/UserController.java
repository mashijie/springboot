package pers.sj.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pers.sj.pojo.Properties;
import pers.sj.util.JsonUtil;

@RestController
public class UserController {
	@Autowired
	Properties properties;
	
	
	@RequestMapping("/getUser")
	public String getUser(){
		Properties bean=new Properties();
		BeanUtils.copyProperties(properties, bean);
		return JsonUtil.objectToJson(bean);
	}
}
