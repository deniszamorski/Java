package com.superhero.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class superhero {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String alias;
	private String firstName;
	private String lastName;
	private int age;
	private double strength;
	private double speed;
	private double ability;
	private double totalPower;
	
	public superhero() {
		super();
	}

	public superhero(int id, String alias, String firstName, String lasName, int age, double strength, double speed,
			double ability, double totalPower) {
		super();
		this.id = id;
		this.alias = alias;
		this.firstName = firstName;
		this.lastName = lasName;
		this.age = age;
		this.strength = strength;
		this.speed = speed;
		this.ability = ability;
		this.totalPower = totalPower;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getStrength() {
		return strength;
	}

	public void setStrength(double strength) {
		this.strength = strength;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getAbility() {
		return ability;
	}

	public void setAbility(double ability) {
		this.ability = ability;
	}

	public double getTotalPower() {
		return totalPower;
	}

	public void setTotalPower(double totalPower) {
		this.totalPower = totalPower;
	}

	@Override
	public String toString() {
		return "superhero [id=" + id + ", alias=" + alias + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", age=" + age + ", strength=" + strength + ", speed=" + speed + ", ability=" + ability
				+ ", totalPower=" + totalPower + "]";
	}
	
	
}
