package com.graymatter.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PaymentForFB {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int studentId;
	private Float depositedAmount;
	private String bank;
	private String branch;
	private String date;
	private String paymentSlip;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Float getDepositedAmount() {
		return depositedAmount;
	}

	public void setDepositedAmount(Float depositedAmount) {
		this.depositedAmount = depositedAmount;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}

	public String getPaymentSlip() {
		return paymentSlip;
	}

	public void setPaymentSlip(String paymentSlip) {
		this.paymentSlip = paymentSlip;
	}

	
	
	@Override
	public String toString() {
		return "CompanyIncomes [id="+id+",name="+name+", studentId="+studentId+",depositedAmount="+depositedAmount+",bank="+bank+",branch="+branch+",date="+date+",paymentSlip="+paymentSlip+"]";
	}
	
}
