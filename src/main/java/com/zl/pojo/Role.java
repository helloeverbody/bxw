package com.zl.pojo;

/**
 * 角色表
 */
public class Role {
	private Integer id;// 主键
	private String roleName;// 采购商或供应商
	private String roleType;// 1.企业2.公司
	private Integer isPass; // 是否通过审核，新增字段，0表示在审核，1表示同审核，-1表示未通过审核
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleType() {
		return roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	public Integer getIsPass() {
		return isPass;
	}
	public void setIsPass(Integer isPass) {
		this.isPass = isPass;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", roleName=" + roleName + ", roleType=" + roleType + ", isPass=" + isPass + "]";
	}

	

}
