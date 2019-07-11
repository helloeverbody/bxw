package com.zl.pojo;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 
 * 采购单
 *
 */
@Component
@Scope("prototype")
public class Purchase {
	private Integer id;// 主键
	private String purchaseName;// 采购名称
	private String commodityName;// 产品名
	private String originRequire;// 产地要求
	private String specifications;// 产品规格
	private String levelRequire;// 级别要求
	private String warehouseRequire;// 仓库要求
	private String periodSpot;// 现货或期货
	private String priceRequire;// 价格要求
	private String procureNotes;// 采购说明
	private String paymentMethod;// 付款方式
	private String invoiceType;// 发票类型
	private Province province;// 关联省份id
	private Date purDeadline;// 截止时间
	private String contacts;// 联系人
	private String crporateName;// 公司名称
	private String phoneNumber;// 手机号
	private Integer isClose;// 是否完成交易且关闭
	private User user;// 关联采购商id(外键)

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPurchaseName() {
		return purchaseName;
	}

	public void setPurchaseName(String purchaseName) {
		this.purchaseName = purchaseName;
	}

	public String getCommodityName() {
		return commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public String getOriginRequire() {
		return originRequire;
	}

	public void setOriginRequire(String originRequire) {
		this.originRequire = originRequire;
	}

	public String getSpecifications() {
		return specifications;
	}

	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}

	public String getLevelRequire() {
		return levelRequire;
	}

	public void setLevelRequire(String levelRequire) {
		this.levelRequire = levelRequire;
	}

	public String getWarehouseRequire() {
		return warehouseRequire;
	}

	public void setWarehouseRequire(String warehouseRequire) {
		this.warehouseRequire = warehouseRequire;
	}

	public String getPeriodSpot() {
		return periodSpot;
	}

	public void setPeriodSpot(String periodSpot) {
		this.periodSpot = periodSpot;
	}

	public String getPriceRequire() {
		return priceRequire;
	}

	public void setPriceRequire(String priceRequire) {
		this.priceRequire = priceRequire;
	}

	public String getProcureNotes() {
		return procureNotes;
	}

	public void setProcureNotes(String procureNotes) {
		this.procureNotes = procureNotes;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getInvoiceType() {
		return invoiceType;
	}

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}


	public Date getPurDeadline() {
		return purDeadline;
	}

	public void setPurDeadline(Date purDeadline) {
		this.purDeadline = purDeadline;
	}

	public String getContacts() {
		return contacts;
	}

	public void setContacts(String contacts) {
		this.contacts = contacts;
	}

	public String getCrporateName() {
		return crporateName;
	}

	public void setCrporateName(String crporateName) {
		this.crporateName = crporateName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getIsClose() {
		return isClose;
	}

	public void setIsClose(Integer isClose) {
		this.isClose = isClose;
	}

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	@Override
	public String toString() {
		return "Purchase [id=" + id + ", purchaseName=" + purchaseName + ", commodityName=" + commodityName
				+ ", originRequire=" + originRequire + ", specifications=" + specifications + ", levelRequire="
				+ levelRequire + ", warehouseRequire=" + warehouseRequire + ", periodSpot=" + periodSpot
				+ ", priceRequire=" + priceRequire + ", procureNotes=" + procureNotes + ", paymentMethod="
				+ paymentMethod + ", invoiceType=" + invoiceType + ", province=" + province + ", purDeadline="
				+ purDeadline + ", contacts=" + contacts + ", crporateName=" + crporateName + ", phoneNumber="
				+ phoneNumber + ", isClose=" + isClose + ", user=" + user + "]";
	}
	
}
