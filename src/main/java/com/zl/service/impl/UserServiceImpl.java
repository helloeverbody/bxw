package com.zl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.dao.UserDao;
import com.zl.pojo.User;
import com.zl.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao ud;

	public User userLogin(User user) {
		if (user.getName() != null && !"".equals(user.getName()) && user.getPsd() != null
				&& !"".equals(user.getPsd())) {
			return ud.userLogin(user);
		}
		return null;
	}

	@Override
	public List<User> querryAllUser() {
		return ud.querryAllUser();
	}

	@Override
	public User querryUserById(int id) {
		return ud.querryUserById(id);
	}

	@Override
	public int updateUser(User user) {
		return ud.updateUser(user);
	}

	@Override
	public int userRegister(User user) {
		return ud.userRegister(user);
	}

}
