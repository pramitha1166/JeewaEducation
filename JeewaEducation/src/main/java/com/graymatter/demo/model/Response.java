package com.graymatter.demo.model;

public class Response {

	private String status;
	private VisaApplication visaApplication;
	
	
	public Response() {
		
	}
	
	public Response(String status) {
		super();
		this.status = status;
	}

	public Response(String status, VisaApplication visaApplication) {
		this.status = status;
		this.visaApplication = visaApplication;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public VisaApplication getVisaApplication() {
		return visaApplication;
	}

	public void setVisaApplication(VisaApplication visaApplication) {
		this.visaApplication = visaApplication;
	}

	
	
	
}
