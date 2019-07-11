package com.zl.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 市实体类
 */
@Component
@Scope("protetype")
public class City {
	private Integer id;// 主键
	private String cityName;// 市名
	private Province province;// 省份外键

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", cityName=" + cityName + ", province=" + province + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
