package com.zl.dao;

import com.zl.pojo.Province;

/**
 * 省表dao层
 *
 */
public interface ProvinceDao {
	/**
	 * 根据id查询省
	 *
	 */
	public Province queryProvinceById(int id);
}
