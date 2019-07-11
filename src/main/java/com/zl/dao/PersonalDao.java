package com.zl.dao;
import com.zl.pojo.Personal;

public interface PersonalDao {
	/**
	 * 根据信息ID查询个人信息
	 */
	public Personal queryPersonalById(int id);
	/**
	 * 添加个人信息
	 */
	public int addPersonal(Personal personal);
	/**
	 * 根据id修改个人信息
	 */
	public int updatePersonal(Personal personal);
}
