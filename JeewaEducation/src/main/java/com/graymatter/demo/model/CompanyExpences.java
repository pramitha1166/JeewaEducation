package com.graymatter.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CompanyExpences {
	@Id
	private int id;
	private String type;
	private int amount;
		
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

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "CompanyExpences [id="+id+", type="+type+",amount="+amount+"]";
	}
	
}
