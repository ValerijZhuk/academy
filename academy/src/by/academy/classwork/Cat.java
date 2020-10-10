package by.academy.classwork;

public class Cat {
	int age;
	String nickname;
	double money=100;
	
	public Cat() {	
	}
	
	public Cat(String nickname) {
		this.nickname = nickname;
	}
	public void setMoney (double money) {
		this.money = money;
	}
	public double getMoney () {
		return money;
	}
	public void grow(int addAge) {
		age = age + addAge;
	}
	
	public void eat() {
		System.out.println("Кот ест");
	}
	
	public void sleep() {
		System.out.println("Кот спит");
	}
	
	public void walk() {
		System.out.println("Кот гуляет");
	}
	
}
