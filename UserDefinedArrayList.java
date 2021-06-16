package lab;

import java.util.*;

public class UserDefinedArrayList {
	public static void main(String[] args) {
		List<Student> arr=new ArrayList<Student>();
		arr.add(new Student(111,"sairaj"));
		arr.add(new Student(222,"viraj"));
		arr.add(new Student(333,"sushant"));
		arr.add(new Student(444,"tejas"));
		arr.forEach(sai ->{
			System.out.println("name ="+sai.name+", id="+sai.id);
		});
		for(Student sai:arr) {
			if(sai.id==MyConsole.getInteger("Enter the Student id to get name of the student")) {
				System.out.println("the name of the student is :"+sai.name);
			}
			else {
				System.out.println("Student not found");
			}
		}
	}
}

class Student{
	int id;
	String name;
	Student(){}
	Student(int id,String name){
		this.name=name;
		this.id=id;
	}
}
