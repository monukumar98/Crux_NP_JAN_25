package Lec22;

//import java.util.ArrayList;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList<Integer> ll = new ArrayList<>();
		System.out.println("Hey");
		Student s = new Student();
		System.out.println(s.name);
		System.out.println(s.age);
		s.name = "Raj";
		s.age = 22;
		System.out.println(s.name);
		System.out.println(s.age);
		s.Intro_yourSelf();
		Student s1 = new Student();
		s1.name = "Kaju";
		s1.age = 21;
		s1.Intro_yourSelf();
		s1.SayHey("Kamlesh");// kay say hey Kamlesh
		s1.MentorName();
		Student.MentorName();
	}

	static {
		System.out.println("I am in student Client class1");
	}
	static {
		System.out.println("I am in student Client class2");
	}

}
