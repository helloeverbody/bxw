package com.zl.dao;

import com.zl.pojo.Enterprise;

/**
 * 企业表Dao层
 * 
 * 包括对企业表的增查
 *
 */
public interface EnterpriseDao {
	/**
	 * 增加一个企业
	 * 
	 * @param enterprise
	 *            要增加的企业
	 * @return 操作结果
	 */
	public int addEnterprise(Enterprise enterprise);

	/**
	 * 通过会员的id查询企业信息
	 * 
	 * @param userId
	 *            会员的id
	 * @return 要返回的企业
	 */

	public Enterprise querryEnterpriseByUserId(int userId);

	/**
	 * 更新企业信息
	 * 
	 * @param enterprise
	 *            要更新的企业
	 * @return 操作结果
	 */
	public int updateEnpterprise(Enterprise enterprise);
}
