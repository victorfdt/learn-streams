package com.victor.streams.entity;

public class Employee {

	public Employee(String name, double bonus) {
		this.fullName = name;
		this.bonus = bonus;
	}

	public Employee() {
	}

	private String fullName;
	private double bonus;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
}
