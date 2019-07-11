package com.zl.pojo;

/**
 * 订单项表
 */
public class OrderItem {
	private Integer id;// 主键
	private Order order;// 关联订单id(外键)
	private Commodity commodity;// 关联资源单id(外键)
	private Integer unitPrice;// 单价
	private Integer number;// 数量
	private Integer totalProce;// 总价

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Commodity getCommodity() {
		return commodity;
	}

	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}

	public Integer getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getTotalProce() {
		return totalProce;
	}

	public void setTotalProce(Integer totalProce) {
		this.totalProce = totalProce;
	}

	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", order=" + order + ", commodity=" + commodity + ", unitPrice=" + unitPrice
				+ ", number=" + number + ", totalProce=" + totalProce + "]";
	}

}
