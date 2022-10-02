package unit5;

import java.time.LocalDate;

public class Person {
    public String name;
    public int age;
    public LocalDate birth = LocalDate.now();

    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

	public void showPerson() {
		System.out.println(String.format("%s (%d years old）", name, age));
    }
	public void showBirthday() {
		System.out.println(birth);
	}
}