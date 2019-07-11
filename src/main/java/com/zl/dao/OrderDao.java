package com.zl.dao;

import java.util.List;

import com.zl.pojo.Order;

/**
 * 订单表的增查功能
 * 
 * @author
 *
 */
public interface OrderDao {
	/**
	 * 增加订单
	 * 
	 * @param order
	 *            要增加的订单
	 * @return 操作结果
	 */
	public int addOrder(Order order);

	/**
	 * 根据会员的ID中供应商查询与其相关的订单
	 * 
	 * @param supplierId
	 *            要查询的供应商id
	 * @return 会员的所有订单
	 */
	public List<Order> querryOrderBySupplierId(int supplierId);

	/**
	 * 根据会员的ID中采购商查询相关的订单
	 * 
	 * @param purchaserId
	 *            要查询的采购商ID
	 * @return 与采购商的相关订单
	 */
	public List<Order> querryOrderByPurchaserId(int purchaserId);

	/**
	 * 根据订单ID查询相关订单
	 * 
	 * @param id
	 *            要查询的订单ID
	 * @return 要查询的订单
	 */
	public Order querryOrderById(int id);

	/**
	 * 通过订单ID修改订单状态
	 * 
	 * @param order
	 *            要修改的订单ID
	 * @return 修改结果
	 */
	public int updateOrderStatusById(Order order);

	/**
	 * 通过订单ID修改订单的支付状态
	 * 
	 * @param order
	 *            要修改的订单
	 * @return 修改结果
	 */
	public int updatePayStatusById(Order order);

}
