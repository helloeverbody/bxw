package com.zl.pojo;

/**
 * 县或街道表
 */
public class County {
	private Integer id;
	private String countyName;// 县名
	private City city;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCountyName() {
		return countyName;
	}

	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "County [id=" + id + ", countyName=" + countyName + ", city" + city + "]";
	}

}
