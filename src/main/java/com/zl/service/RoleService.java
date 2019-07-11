package com.zl.service;

import com.zl.pojo.Role;

public interface RoleService {
	/**
	 * 添加角色
	 * @param role
	 * @return
	 */
	public int addRole(Role role);
	/**
	 * 通过角色表的id查询角色信息
	 * @param id
	 * @return
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
