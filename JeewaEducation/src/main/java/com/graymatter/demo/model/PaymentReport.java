package com.graymatter.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PaymentReport {
	@Id
	private int id;
	private String month;
	private int year;
	private Float totIncome;
	private Float totExpences;
	private Float profit;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Float getTotIncome() {
		return totIncome;
	}
	public void setTotIncome(Float totIncome) {
		this.totIncome = totIncome;
	}
	public Float getTotExpences() {
		return totExpences;
	}
	public void setTotExpences(Float totExpences) {
		this.totExpences = totExpences;
	}
	public Float getProfit() {
		return profit;
	}
	public void setProfit(Float profit) {
		this.profit = profit;
	}
	
	@Override
	public String toString() {
		return "CompanyExpences [id="+id+", month="+month+",year="+year+",totIncome="+totIncome+",totExpences="+totExpences+",profit="+profit+"]";
	}
}
