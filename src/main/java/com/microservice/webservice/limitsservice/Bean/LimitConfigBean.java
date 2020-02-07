package com.microservice.webservice.limitsservice.Bean;

public class LimitConfigBean {
	
	private int maximum;
	private int minimum;

	protected LimitConfigBean() {
		
	}
	
	public LimitConfigBean(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	
}
