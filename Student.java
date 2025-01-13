package student;

public class Student {
	private String name;
	private int age;
	public Student(int age, String name) {
		this.name = name;
		this.setAge(age);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
}
