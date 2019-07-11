package com.zl.pojo;

/**
 * 个人信息表
 */
public class Personal {
	private Integer id;// 主键
	private String realName;// 真实姓名
	private String idcard;// 身份证号码
	private String idcardImg;// 身份证照片
	private String address;// 联系地址
	private String phoneNumber;// 手机号码
	private String email;// 电子邮箱
	private String telephone;// 单位座机
	private User user;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getIdcardImg() {
		return idcardImg;
	}

	public void setIdcardImg(String idcardImg) {
		this.idcardImg = idcardImg;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Personal [id=" + id + ", realName=" + realName + ", idcard=" + idcard + ", idcardImg=" + idcardImg
				+ ", address=" + address + ", phoneNumber=" + phoneNumber + ", email=" + email + ", telephone="
				+ telephone + ", user=" + user + "]";
	}

}
