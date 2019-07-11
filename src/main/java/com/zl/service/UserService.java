package com.zl.service;



import java.util.List;

import com.zl.pojo.User;



public interface UserService {
	/**
	 * 登录方法
	 * @param user
	 * @return
	 */
	public User userLogin(User user);
	/**
	 * 查询所有会员
	 * @return
	 */
	public List<User> querryAllUser();
	/**
	 * 根据ID查询会员
	 * @param id
	 * @return
	 */
	public User querryUserById(int id);
	/**
	 * 更新用户信息
	 * @param user
	 * @return
	 */
	public int updateUser(User user);
	/**
	 * 用户注册
	 */
	
	public int userRegister(User user);

}
