package lab;

public class HashCodeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 obj1=new Student2(111,"sairaj");
		Student2 obj2=new Student2(222,"viraj");
		System.out.println(obj1.toString());//internally obj1.toString method is called which contains hashCode() method
		System.out.println(obj2);
		
	}

}



class Student2{
	int rollNo;
	String name;
	Student2(int rollNo,String name){
		this.name=name;
		this.rollNo=rollNo;
	}
	@Override
	public int hashCode() {
		return this.rollNo;
	}
	@Override
	public String toString() {
	
		return ""+rollNo;
	}
}