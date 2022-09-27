package unit4;

public class PersonBasic {
	public static void main(String[] args) {
		// Create a p1 object and set its name and age.
        var p1 = new Person();
        p1.name = "Yamada Taro";
        p1.age = 30;
        
        // Create p2 object in default form
        var p2 = new Person();
        
        // Output show() method results for p1 and p2 objects
        System.out.println("Output of object methods");
        System.out.println(p1.show());
        System.out.println(p2.show());
        
        // element and output in the same form as the show() method
        System.out.println("Output from element");
        System.out.printf("%s（%d years old）\n", p1.name, p1.age);
        System.out.printf("%s（%d years old）\n", p2.name, p2.age);

    }
}
