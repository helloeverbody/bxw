package com.zl.dao;

import java.util.List;

import com.zl.pojo.BiddingPrice;

/**
 * 竞价表的dao层
 *
 */
public interface BiddingPriceDao {
	/**
	 * 查询竞价表
	 *
	 */
	public BiddingPrice queryUserByUserId();
	/**
	 * 添加要竞价的供应商
	 *
	 */
	public int addUser();
}
