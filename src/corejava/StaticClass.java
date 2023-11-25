package corejava;

public class StaticClass {

	static int a = 4;
	String name = "john"; // instance variable - for each obj creation a copy of this var is given

	static String firstname; // class variable scoped to class level shared with objects
	static String lastname;

	static {
		firstname = "John";
		lastname = "Wick";
	}

	public StaticClass() {
		System.out.println(name);
	}

	public StaticClass(int a, int b) {
		int sum = a + b; // sum is local var scoped to this constructor block
		System.out.println(sum);
	}

	public static void main(String[] args) {

		StaticClass sc = new StaticClass(20, 10);

		StaticClass.fullName(); // Accessing static method

		StaticClass sc2 = new StaticClass();
		sc2.a = a + 1;

		System.out.println(StaticClass.a); // Accessing static variable

	}

	public void displayName() {
		System.out.println(name);
	}

	public static void fullName() {
		System.out.println(firstname + " " + lastname);
	}

}
