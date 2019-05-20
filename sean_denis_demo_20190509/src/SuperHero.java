import java.util.ArrayList;
import java.util.List;

public class SuperHero {
	private int id;
	private String name;
	private List<String> superPowers;
	
	public SuperHero(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.superPowers = new ArrayList<>();
	}
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
	public List<String> getSuperPowers() {
		return superPowers;
	}
	public void setSuperPowers(List<String> superPowers) {
		this.superPowers = superPowers;
	}
	public void addSuperPower(String sp) {
		superPowers.add(sp);
	}
	
	@Override
	public String toString() {
		return "SuperHero [id=" + id + ", name=" + name + ", superPowers=" + superPowers + "]";
	}
	
	
}
