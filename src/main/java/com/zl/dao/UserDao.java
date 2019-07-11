package com.zl.dao;

import java.util.List;

import com.zl.pojo.User;

/**
 * 会员表的dao层
 *
 */
public interface UserDao {
	/**
	 * 查询所有会员
	 * 
	 * @return 一个会员的list集合
	 */
	public List<User> querryAllUser();

	/**
	 * 通过id查询会员
	 * 
	 * @return 一个会员
	 */
	public User querryUserById(int id);

	/**
	 * 更新用户信息
	 * 
	 * @param user
	 *            要更新的用户
	 * @return 返回操作结果
	 */
	public int updateUser(User user);

	/**
	 * 用户登录操作
	 * 
	 * @param user
	 *            要登录的用户
	 * @return 返回的用户，所查询的用户
	 */

	public User userLogin(User user);

	/**
	 * 用户注册功能
	 * 
	 * @param user
	 *            要注册的用户
	 * @return 返回注册结果
	 */
	public int userRegister(User user);
}
