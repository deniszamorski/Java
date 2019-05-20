package business;

public class SuperHeroes {
	private String name;
	private String alias;
	private int age;
	private double strength;
	private double speed;
	private double mental;
	private double totalPower = sum(strength + speed + mental);
	
	public SuperHeroes(String name, String alias, int age, double strength, double speed, double mental,
			double totalPower) {
		super();
		this.name = name;
		this.alias = alias;
		this.age = age;
		this.strength = strength;
		this.speed = speed;
		this.mental = mental;
		this.totalPower = totalPower;
	}

	private double sum(double d) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
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

	public double getMental() {
		return mental;
	}

	public void setMental(double mental) {
		this.mental = mental;
	}

	public double getTotalPower() {
		return totalPower;
	}

	public void setTotalPower(double totalPower) {
		this.totalPower = totalPower;
	}
	
	
}
