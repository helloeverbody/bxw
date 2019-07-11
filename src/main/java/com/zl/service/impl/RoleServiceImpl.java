package com.zl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.dao.RoleDao;
import com.zl.pojo.Role;
import com.zl.service.RoleService;
@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleDao rd;
	@Override
	public int addRole(Role role) {
		return rd.addRole(role);
	}

	@Override
	public Role querryById(int id) {
		return rd.querryById(id);
	}

	@Override
	public int updateRole(Role role) {
		return rd.updateRole(role);
	}
	
}
