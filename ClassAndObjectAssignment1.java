package lab;

public class ClassAndObjectAssignment1 {

	public static void main(String[] args) {
	/*	Student4 obj=new Student4();
		obj.name="john";
		obj.roll_no=2;
		Student4 obj1=new Student4();
		obj1.address="wjkncjiwbljnjkv jnfjwn";
		obj1.name="sam";
		obj1.phoneNo="+91 "+9967498282l;
		System.out.println(obj1.address);
		System.out.println(obj1.name);
		System.out.println(obj1.phoneNo);
		Student4 obj2=new Student4();
		obj2.address="wjkncjiwbljnjkv jnfjwn";
		obj2.name="john";
		obj2.phoneNo="+91 "+8850423908l;
		System.out.println(obj2.address);
		System.out.println(obj2.name);
		System.out.println(obj2.phoneNo);*/
	//	Triangle obj3=new Triangle();
		Rectangle rec=new Rectangle(4,5);
		System.out.println(rec.area());
		Rectangle rec1=new Rectangle(5,8); 
		System.out.println(rec1.area());
	}

}

class Student4{
	int roll_no;
	String name;
	String address;
	String phoneNo;
}

class Triangle{
	int s1=3;
	int s2=4;
	int s3=5;
	Triangle(){
		int semiperimetre=(s1+s2+s3)/2;
		int area=(int)Math.sqrt(semiperimetre*(semiperimetre-s1)*(semiperimetre-s2)*(semiperimetre-s3));
		System.out.println("area of triange="+area);
		System.out.println("perimeter of triange="+(s1+s2+s3));
	}
}

class Rectangle{
	int a;
	int b;
	Rectangle(int side1,int side2){
		a=side1;
		b=side2;
	}
	int area() {
		return this.a*this.b;
	}
}










