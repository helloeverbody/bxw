package com.zl.dao;

import java.util.List;

import com.zl.pojo.FenYe;
import com.zl.pojo.Purchase;



public interface PurchaseDao {
	/**
	 * 添加,发布采购信息
	 */
	public int addPurchase(Purchase purchase);
	/**
	 * 删除发布的采购信息
	 */
	public int deletePurchaseById(int id);
	/**
	 * 查看所有的发布信息
	 */
	public List<Purchase>queryPurchaseByFenYe(FenYe fy);//多条件分页查询
	/**
	 * 通过id查看发布的完整信息
	 */
	public Purchase queryPurchaseById(int id);
	
	
}
