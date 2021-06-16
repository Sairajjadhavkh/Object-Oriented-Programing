package lab;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sairaj";//here one object created in constant pool which is in method area.
		String s1=new String("jadhav"); //here 2 objects are created one in heap area and in constant pool area if that object is present in constant pool area which is in method area then on object is created 
		//in method area the memory will get free when jvm is shut down but in heap area if there is no reference pointing to an object then that object is destroyed by garbage collection.
		System.out.println(s);
		System.out.println(s1.toString());
		System.out.println(s1.charAt(2));
		String a=s.concat("jadhav");
		System.out.println(a);
		
		
		
		
		StringBuffer s2=new StringBuffer("viraj");
		s2.append("sairaj");
		System.out.println(s2);
		int d[]=new int[3];
		System.out.println(d.length);
	}
}
