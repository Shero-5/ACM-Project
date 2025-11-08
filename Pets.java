package main;

public class Pets {
	protected String name;
	protected String petType;
	protected int hunger;
	protected int happiness;
	
	public Pets(String name, String petType) {
		this.name = name;
		this.petType = petType;
		this.hunger = 70;
		this.happiness = 70;
	}
	
	public void needDecay() {
		
	}
	
	public String getName() { return name; }
	public String getPetType() { return petType; }
	public int getHunger() { return hunger; }
	public int getHappiness() { return happiness; }
}

	class IceCreamBunny extends Pets {
		public IceCreamBunny(String name) {
			super(name, "Ice Cream Bunny");
		}
	}
	
	class Gun extends Pets {
		public Gun(String name) {
			super(name, "Gun");
		}
	}
	
	class Puppy extends Pets {
		public Puppy(String name) {
			super(name, "Puppy");
		}
	}
