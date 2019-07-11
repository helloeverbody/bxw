package com.zl.pojo;

import java.util.Date;

/**
 * 订单表
 */
public class Order {
	private Integer id;// 主键
	private User purchaser;// 关联采购商id(外键)
	private User supplier;// 关联供应商id(外键)
	private Date orderTime;// 订单时间
	private String orderNumber;// 订单编号
	private String orderStatus;// 1.表示已完成0.表示未完成2表示已废弃
	private String payStatus;// 1.表示已支付0.表示未支付

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getPurchaser() {
		return purchaser;
	}

	public void setPurchaser(User purchaser) {
		this.purchaser = purchaser;
	}

	public User getSupplier() {
		return supplier;
	}

	public void setSupplier(User supplier) {
		this.supplier = supplier;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", supplier=" + supplier + ", purchaser=" + purchaser + ", orderTime=" + orderTime
				+ ", orderNumber=" + orderNumber + ", orderStatus=" + orderStatus + ", payStatus=" + payStatus + "]";
	}

}
