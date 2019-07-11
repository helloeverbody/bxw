package com.zl.pojo;

/**
 * 资源单表
 */
public class Commodity {
	private Integer id;
	private String commodityName;// 商品名称
	private String placeOrigin;// 产地
	private String specificationType;// 规格型号
	private String level;// 商品级别
	private Integer inventoryQuantity;// 库存表
	private Double unitPrice; // 单价
	private Double currency;// 货币
	private String warehouse;// 仓库
	private String periodSpot;// 现货或期货
	private String remarks;// 资源单备注
	private User user;// 关联会员表中供应商

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCommodityName() {
		return commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public String getPlaceOrigin() {
		return placeOrigin;
	}

	public void setPlaceOrigin(String placeOrigin) {
		this.placeOrigin = placeOrigin;
	}

	public String getSpecificationType() {
		return specificationType;
	}

	public void setSpecificationType(String specificationType) {
		this.specificationType = specificationType;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Integer getInventoryQuantity() {
		return inventoryQuantity;
	}

	public void setInventoryQuantity(Integer inventoryQuantity) {
		this.inventoryQuantity = inventoryQuantity;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Double getCurrency() {
		return currency;
	}

	public void setCurrency(Double currency) {
		this.currency = currency;
	}

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	public String getPeriodSpot() {
		return periodSpot;
	}

	public void setPeriodSpot(String periodSpot) {
		this.periodSpot = periodSpot;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Commodity [id=" + id + ", commodityName=" + commodityName + ", placeOrigin=" + placeOrigin
				+ ", specificationType=" + specificationType + ", level=" + level + ", inventoryQuantity="
				+ inventoryQuantity + ", unitPrice=" + unitPrice + ", currency=" + currency + ", warehouse=" + warehouse
				+ ", periodSpot=" + periodSpot + ", remarks=" + remarks + ", user=" + user + "]";
	}

}
