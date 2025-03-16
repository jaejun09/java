package com.jjbae.app.stock;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class StockVo {
	private String code;
	private String name;
	private String current;
	private String comparePrv;
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCurrent() {
		return current;
	}
	
	public void setCurrent(String current) {
		this.current = current;
	}
	
	public String getComparePrv() {
		return comparePrv;
	}
	
	public void setComparePrv(String comparePrv) {
		this.comparePrv = comparePrv;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
