package callCenter.model;

import java.util.Date;

public class Register {
	private String storeName;
	private Double value;
	private Date date;
	public Register(String storeNumber, Double value, Date date) {
		super();
		this.storeName = storeNumber;
		this.value = value;
		this.date = date;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeNumber) {
		this.storeName = storeNumber;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Register [storeNumber=" + storeName + ", value=" + value + ", date=" + date + "]";
	}
	
}
