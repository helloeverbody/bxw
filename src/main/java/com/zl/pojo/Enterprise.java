package com.zl.pojo;

/**
 * 企业信息表
 */
public class Enterprise {
	private Integer id;
	private String name;// 公司名称
	private String address;// 详细地址
	private String licenseImg;// 营业执照图
	private String organizationImg;// 机构组织图
	private String taxImg;// 税务登记图
	private String officeImg;// 办公场所图
	private String circulationImg;// 食品流通许可证
	private String otherImg1;// 以下为其他图片
	private String otherImg2;
	private String otherImg3;
	private String otherImg4;
	private Province province;// 省份对象
	private City city; // 级联市表
	private County county; // 级联县表
	private String legalName;// 法人姓名
	private String operatorName;// 运营者姓名
	private String operatorPosition;// 运营者职务
	private String operatorInf;// 运营者联系方式
	private User user; // 关联user表

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public County getCounty() {
		return county;
	}

	public void setCounty(County county) {
		this.county = county;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLicenseImg() {
		return licenseImg;
	}

	public void setLicenseImg(String licenseImg) {
		this.licenseImg = licenseImg;
	}

	public String getOrganizationImg() {
		return organizationImg;
	}

	public void setOrganizationImg(String organizationImg) {
		this.organizationImg = organizationImg;
	}

	public String getTaxImg() {
		return taxImg;
	}

	public void setTaxImg(String taxImg) {
		this.taxImg = taxImg;
	}

	public String getOfficeImg() {
		return officeImg;
	}

	public void setOfficeImg(String officeImg) {
		this.officeImg = officeImg;
	}

	public String getCirculationImg() {
		return circulationImg;
	}

	public void setCirculationImg(String circulationImg) {
		this.circulationImg = circulationImg;
	}

	public String getOtherImg1() {
		return otherImg1;
	}

	public void setOtherImg1(String otherImg1) {
		this.otherImg1 = otherImg1;
	}

	public String getOtherImg2() {
		return otherImg2;
	}

	public void setOtherImg2(String otherImg2) {
		this.otherImg2 = otherImg2;
	}

	public String getOtherImg3() {
		return otherImg3;
	}

	public void setOtherImg3(String otherImg3) {
		this.otherImg3 = otherImg3;
	}

	public String getOtherImg4() {
		return otherImg4;
	}

	public void setOtherImg4(String otherImg4) {
		this.otherImg4 = otherImg4;
	}

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	public String getLegalName() {
		return legalName;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getOperatorPosition() {
		return operatorPosition;
	}

	public void setOperatorPosition(String operatorPosition) {
		this.operatorPosition = operatorPosition;
	}

	public String getOperatorInf() {
		return operatorInf;
	}

	public void setOperatorInf(String operatorInf) {
		this.operatorInf = operatorInf;
	}

	@Override
	public String toString() {
		return "Enterprise [id=" + id + ", name=" + name + ", address=" + address + ", licenseImg=" + licenseImg
				+ ", organizationImg=" + organizationImg + ", taxImg=" + taxImg + ", officeImg=" + officeImg
				+ ", circulationImg=" + circulationImg + ", otherImg1=" + otherImg1 + ", otherImg2=" + otherImg2
				+ ", otherImg3=" + otherImg3 + ", otherImg4=" + otherImg4 + ", province=" + province + ", city=" + city
				+ ", county=" + county + ", legalName=" + legalName + ", operatorName=" + operatorName
				+ ", operatorPosition=" + operatorPosition + ", operatorInf=" + operatorInf + ", user=" + user + "]";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
