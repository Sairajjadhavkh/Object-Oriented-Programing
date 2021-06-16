package lab;

public class ToStringExample {

	public static void main(String[] args) {
		
		Student1 sai=new Student1(123,"sairaj");
		System.out.println(sai);
	}
}


// when we try to print an object jvm will call toString() method implicitly which is present in Object Class.
//Syntax of tOString method
/*public String toString() {
	returns getClass().getName() + "@" +Integer.toHexString(hashCode());
}*/

class Student1 extends Object{
	int rollNo;
	String name;
	Student1(int rollNo,String name){
		this.name=name;
		this.rollNo=rollNo;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.rollNo;
	}
	/*public String toString() {
		return "id of the Student is "+this.rollNo+ " and name is "+this.name; 
	}*/
}