package unit5;

public class PersonBasic {
	public static void main(String[] args) {
		// Create a p1 object of class "Person"
        var p1 = new Person("Yamada", 20);
        
        // Create p2 object of class "BusinessPerson"
        var p2 = new BuisinessPerson("Sato",30);
        
        // Output show() method results for p1 and p2 objects
        System.out.println("Output of object methods");
        p1.showPerson();
        p2.showPerson();
        p1.showBirthday();
        p2.showBirthday();
    }
}
