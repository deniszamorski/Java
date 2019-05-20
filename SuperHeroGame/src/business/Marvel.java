package business;

public class Marvel extends SuperHeroes {
	private String creator;
	private String license;

	public Marvel(String name, String alias, int age, double strength, double speed, double mental, double totalPower) {
		super(name, alias, age, strength, speed, mental, totalPower);
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}
	

}
