package by.academy.classwork;

public class Aplication {

	public static void main(String[] args) {
		Cat cat = new Cat("Barsik");

		cat.eat();
		cat.sleep();
		cat.walk();

		System.out.println(cat.getMoney());
		
	}

}