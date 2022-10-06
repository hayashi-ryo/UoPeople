package unit4;

public class Person {
    public String name = "default";
    public int age = 20;

    // コンストラクター
    public Person() {
        this.name = name;
        this.age = age;
    }

	public String show() {
        return String.format("%s (%d years old）", this.name, this.age);
    }
}