package Lec22;

public class Person {
	private String name = "Kaju";
	private int age = 20;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {

		return age;
	}

	public void setAge(int age) {
		try {
			if (age < 0 || age > 78) {
				throw new Exception("Bklol age -ve nhi hoga");
			}
			this.age = age;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("I am in finaly block ");
		}
	}

//	public void setAge(int age)throws Exception {
//		if (age < 0 || age >78) {
//			throw new Exception("Bklol age -ve nhi hoga");
//		}
//		this.age = age;
//	}

}
