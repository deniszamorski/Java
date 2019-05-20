
public class SuperHeroApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the super hero generator app.");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter a new superhero");
			
			String name = Console.getRequiredString("Superhero name: ");
			int id = Console.getInt("Superhero id: ");
			
			SuperHero sh = new SuperHero(id, name);
			
			String superPower = "";
			while (!superPower.equalsIgnoreCase("x")) {
				superPower = Console.getRequiredString("enter Super Power ('x' will exit):");
				if (!superPower.equalsIgnoreCase("x")) {
					// add the superpower
					sh.addSuperPower(superPower);
				}
			}
			System.out.println("You created a new superhero: "+sh.toString());
			choice = Console.getRequiredString("continue?");
		}
		
		System.out.println("bye");

	}

}
