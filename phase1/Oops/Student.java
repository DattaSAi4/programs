package Oops;

public class Student {
	
	int idno ;
	String name;
	String course;
	Student(int id,String nam,String cour)
	{
		idno=id;
		name=nam;
		course=cour;
	}
	public void student_Details()
	{
		System.out.println("The Student ID is  :" +idno);
		System.out.println("Name of the students :" +name);
		System.out.println("The course he enabled :" +course);
		System.out.println("***************************");
	}
	public static void main(String[] args)
	{
		Student s1 = new Student(100,"vinay","java");
		Student S2 = new Student(101,"sai",".net");
		s1. student_Details();
		S2. student_Details();
	}
	

}
