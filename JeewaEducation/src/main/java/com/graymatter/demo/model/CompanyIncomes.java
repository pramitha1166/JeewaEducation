package com.graymatter.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CompanyIncomes {
	@Id
	private int id;
	private String type;
	private Double amount;	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "CompanyIncomes [id="+id+", type="+type+",amount="+amount+"]";
	}
	
}
