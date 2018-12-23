package pers.sj.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import pers.sj.pojo.User;

@Controller
@RequestMapping("th")
public class thymeleafController {

	@RequestMapping("/index")
	public String index(ModelMap model){
		model.addAttribute("name", "hello thymeleaf");
		return "thymeleaf/index";
	}
	@RequestMapping("/center")
	public String center(){
		return "thymeleaf/center/center";
	}
	@RequestMapping("/test")
	public String test(ModelMap model){
		//存入单个值
		model.addAttribute("name", "admin");
		model.addAttribute("password", "123456");
		//存入对象
		User user=new User();
		user.setAge(12);
		user.setName("user1");
		user.setPassWord("1231233");
		user.setBirthday(new Date());
		model.addAttribute("user", user);
		//存入文本信息
		String text="<h1 style='color:red'>hello Spring</h1>";
		model.addAttribute("text", text);
		//存入list集合
		List<User> userList=new ArrayList<User>();
		User user2=new User();
		user2.setAge(12);
		user2.setName("user2");
		user2.setPassWord("1231233");
		user2.setBirthday(new Date());
		userList.add(user);
		userList.add(user2);
		model.addAttribute("userList", userList);
		return "thymeleaf/test";
	}
	//重定向
	@RequestMapping("postform")
	public String postform(User u){
		System.out.println(u.getName());
		return "redirect:/th/test";		
	}
	
}
