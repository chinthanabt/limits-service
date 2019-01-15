package com.chinthana.learn.springboot.restfull.limitsservice.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {
	
	private int minimum;
	private int maximum;
	private boolean setMaximum;
	
	public int getMinimum() {
		return minimum;
	}
	
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	
	public int getMaximum() {
		return maximum;
	}
	
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public boolean isSetMaximum() {
		return setMaximum;
	}

	public void setSetMaximum(boolean setMaximum) {
		this.setMaximum = setMaximum;
	}
	
}
