package cn.hassan.code.site.service.impl;

import cn.hassan.code.site.mapper.UserMapper;
import cn.hassan.code.site.pojo.User;
import cn.hassan.code.site.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with idea
 * Author: hss
 * Date: 2019/7/27 11:09
 * Description:
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User findUserById(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}
}
