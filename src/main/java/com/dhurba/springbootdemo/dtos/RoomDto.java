package com.dhurba.springbootdemo.dtos;

public class RoomDto {

	private Integer number;
	private String type;
	private String description;
	private Double price;
	private Boolean isSmoking;
	private Boolean wifiAvailable;
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Boolean getIsSmoking() {
		return isSmoking;
	}
	public void setIsSmoking(Boolean isSmoking) {
		this.isSmoking = isSmoking;
	}
	public Boolean getWifiAvailable() {
		return wifiAvailable;
	}
	public void setWifiAvailable(Boolean wifiAvailable) {
		this.wifiAvailable = wifiAvailable;
	}
	

}
  