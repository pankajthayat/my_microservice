package com.pankaj.microservices.limitsservice.bean;

public class LimitsConfiguration {

	int maximum;
	int minimum;
	
	
	protected LimitsConfiguration() {
		// TODO Auto-generated constructor stub
	}
	public LimitsConfiguration(int maximum, int minimum) {
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
