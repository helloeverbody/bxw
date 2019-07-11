package com.zl.pojo;

/**
 * 省份表
 */
public class Province {
	private Integer id;
	private String provinceName;// 省份名

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	@Override
	public String toString() {
		return "Province [id=" + id + ", provinceName=" + provinceName + "]";
	}

}
