package by.academy.classwork;

public class Cat {
	int age;
	String nickname;
	
	public Cat() {
		
	}
	
	//public Cat(String nickname) {
		
	//}
	
	public Cat(String nickname) {
		this.nickname = nickname;
	}
	
	public void grow(int addAge) {
		age = age + addAge;
	}
	public void eat() {
		System.out.println("��� ����");
	}
	
	public void sleep() {
		System.out.println("��� ����");
	}
	
	public void walk() {
		System.out.println("��� ������");
	}
}
