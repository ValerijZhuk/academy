package by.academy.classwork;

import by.academy.classwork.Cat;

public class Aplication {

	public static void main(String[] args) {
		Cat cat = new Cat("Barsik");
//		Cat cat1 = new Cat("Bug", 3);

		cat.eat();
		cat.sleep();
		cat.walk();

		System.out.println(cat.age);

		cat.grow(1);

		System.out.println(cat.age);

		cat.grow(3);

		System.out.println(cat.age);

//		System.out.println("Bug age:" + cat1.age);

	}

}