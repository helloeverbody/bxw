package com.zl.pojo;
/**
 *会员表
 */
public class User {
	private Integer id;//主键
	private Integer userId;//用户的唯一标识
	private String psd;//密码
	private String name;//用户名
	private Integer roleId;//外键
	private Role role;//关联角色表
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getPsd() {
		return psd;
	}
	public void setPsd(String psd) {
		this.psd = psd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userId=" + userId + ", psd=" + psd + ", name=" + name + ", roleId=" + roleId
				+ ", role=" + role + "]";
	}
	
	
	
}
