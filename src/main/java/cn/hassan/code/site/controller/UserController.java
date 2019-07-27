package cn.hassan.code.site.controller;

import cn.hassan.code.site.pojo.User;
import cn.hassan.code.site.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with idea
 * Author: hss
 * Date: 2019/7/27 11:11
 * Description:
 */
@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/user")
	@ResponseBody
	public User findUserById(Integer id) {
		return userService.findUserById(id);
	}
}
