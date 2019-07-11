package com.zl.dao;

import com.zl.pojo.Role;

/**
 * 角色表dao层
 *
 */
public interface RoleDao {
	/**
	 * 添加角色
	 * 
	 * @param role
	 *            要添加的角色
	 * @return 操作结果
	 */
	public int addRole(Role role);

	/**
	 * 通过角色表的id查询角色信息
	 * 
	 * @param id
	 *            角色id
	 * @return 一个角色
	 */
	public Role querryById(int id);

	/**
	 * 更新角色，只更改用户是否同审核
	 * 
	 * @param role
	 *            要更新的角色
	 * @return 更新结果
	 */
	public int updateRole(Role role);
}
