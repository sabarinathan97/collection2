package Coll2;

public class Student {
	private String name;
	private int id;
	private int age;
	private String gender;
	private String dept;
	private int percent;
	
	public void SetName(String name) {
		this.name= name;
	}
	public String getName() {
		return name;
	}
	public void SetId(int id) {
		this.id= id;
	}
	public int getId() {
		return id;
	}
	public void SetAge(int age) {
		this.age= age;
	}
	public int getAge() {
		return age;
	}
	public void SetGender(String gender) {
		this.gender= gender;
	}
	public String getGender() {
		return gender;
	}
	public void SetDept(String dept) {
		this.dept= dept;
	}
	public String getDept() {
		return dept;
	}
	public void SetPercent(int percent) {
		this.percent = percent;
	}
	public int getPercent() {
		return percent;
	}
	
	public Student(String name,int id,int age,String gender,String dept,int percent) {
		this.name = name; this.id = id; this.age = age; this.gender = gender; 
		this.dept = dept; this.percent = percent;
	}
	public String toString() {
		return name+" "+id+" "+age+" "+gender+" "+dept+" "+percent;
	}

}
