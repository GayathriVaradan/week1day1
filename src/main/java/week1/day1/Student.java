package week1.day1;

public class Student {
	int rollNumber=56;
	String name= "Krish";
		
	public void collegeA() {
		String name = "Ram";
		System.out.println(name);
	}
	
	private void collegeB() {
		String name = "Sai";
		System.out.println(name);
	}
	
	void collegeC() {
		String name = "Sri";
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Student obj1 = new Student();
		obj1.collegeA();
		obj1.collegeB();
		obj1.collegeC();
		System.out.println(obj1.name);
		
	}
	}

