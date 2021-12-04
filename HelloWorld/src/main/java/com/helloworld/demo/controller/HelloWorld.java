package com.helloworld.demo.controller;

import java.util.Date;

public class HelloWorld {

	private Date currentDate;
	private String helloWorld;

	public HelloWorld(String helloWorld) {
		super();
		this.currentDate = new Date();
		this.helloWorld = helloWorld;
	}

	public HelloWorld() {
		super();
	}

	public Date getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}

	public String getHelloWorld() {
		return helloWorld;
	}

	public void setHelloWorld(String helloWorld) {
		this.helloWorld = helloWorld;
	}

	@Override
	public String toString() {
		return "HelloWorld [currentDate=" + currentDate + ", helloWorld=" + helloWorld + "]";
	}

}
