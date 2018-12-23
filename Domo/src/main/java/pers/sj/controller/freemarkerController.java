package pers.sj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import pers.sj.pojo.Properties;

@Controller
@RequestMapping("ftl")
public class freemarkerController {
	@Autowired
	Properties properties;
	@RequestMapping("/index")
	public String index(ModelMap model){
		model.addAttribute("resource", properties);
		return "freemarker/index";
	}
	@RequestMapping("/center")
	public String center(ModelMap model){
		return "freemarker/center/center";
	}
}
