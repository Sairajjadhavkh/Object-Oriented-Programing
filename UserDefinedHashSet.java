package lab;
import java.util.*;
public class UserDefinedHashSet {

	public static void main(String[] args) {
		int num=MyConsole.getInteger("enter no of employee you want to add");
		Set<Employees> arr=new HashSet<Employees>();
		while(num!=0) {
			
			int id=MyConsole.getInteger("enter id");
			MyConsole.getString("");
			String name=MyConsole.getString("enter name");
			arr.add(new Employees(id,name));
			num--;
		}
		arr.forEach(sai ->{
			System.out.println("id="+sai.id+", name="+sai.name );
		});
	}
}

class Employees{
	int id;
	String name;
	Employees(){}
	Employees(int id,String name){
		this.name=name;
		this.id=id;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Integer.hashCode(id);
	}
	@Override
	public boolean equals(Object obj) {
		Employees temp=(Employees)obj; 
		return temp.id==id;
	}
	
}