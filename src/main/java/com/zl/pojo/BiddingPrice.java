package com.zl.pojo;

/**
 * 竞价表
 */
public class BiddingPrice {
	private Integer id;// 主键
	private Purchase purchaseId;// 要竞价的采购单的id(外键)
	private User userId;// 要竞价的供应商(外键)
	private String quoter;// 报价人
	private Commodity commodityId;// 参与报价的资源id(外键)
	private Province provinceId;// 关联省份的id(外键)
	private String phoneNumber;// 联系手机
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Purchase getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(Purchase purchaseId) {
		this.purchaseId = purchaseId;
	}
	public User getUserId() {
		return userId;
	}
	public void setUserId(User userId) {
		this.userId = userId;
	}
	public String getQuoter() {
		return quoter;
	}
	public void setQuoter(String quoter) {
		this.quoter = quoter;
	}
	public Commodity getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(Commodity commodityId) {
		this.commodityId = commodityId;
	}
	public Province getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(Province provinceId) {
		this.provinceId = provinceId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "BiddingPrice [id=" + id + ", purchaseId=" + purchaseId + ", userId=" + userId + ", quoter=" + quoter
				+ ", commodityId=" + commodityId + ", provinceId=" + provinceId + ", phoneNumber=" + phoneNumber + "]";
	}

	

}
