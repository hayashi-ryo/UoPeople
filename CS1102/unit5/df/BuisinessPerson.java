package unit5;

public class BuisinessPerson extends Person{
	
	// constructor
	public BuisinessPerson(String name, int age) {
		super(name, age);
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println(String.format("%s is a Business person.", name));
	}
}
