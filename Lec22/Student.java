package Lec22;

public class Student {

	String name;
	int age;

	public void Intro_yourSelf() {
		System.out.println("My name is " + this.name + " age is " + this.age);

	}

	public void SayHey(String name) {
//		Intro_yourSelf();
		System.out.println(this.name + " Say Hey " + name);
	}

	public static void MentorName() {

		System.out.println("Monu Bhaiya");
	}

	static {
		System.out.println("static block of  student class");
	}
}