package lab;

public class EqualsMethodExample {

	public static void main(String[] args) {
		Student3 obj1=new Student3(101,"sairaj");
		Student3 obj2=new Student3(102,"viraj");
		Student3 obj3=new Student3(101,"sairaj");
		Student3 obj4=obj1;
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));
		System.out.println(obj1.equals(obj4));
	}

}


class Student3{
	int rollNo;
	String name;
	Student3(int rollNo,String name){
		this.name=name;
		this.rollNo=rollNo;
	}
	@Override
	public boolean equals(Object obj) {
		int rollNo=this.rollNo;
		String name=this.name;
		Student3 s=(Student3)obj;
		if(s.name.equals(name)&& s.rollNo==rollNo)
			return true;
		else
			return false;
			
	}
}



