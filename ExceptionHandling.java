
package lab;
import java.io.IOException;
import java.util.*;
public class ExceptionHandling {
	
	public static void main(String args[])throws Coustomized
	{
		int age=MyConsole.getInteger("enter the age");
		Age a=new Age();
		try{
			a.m1(12);
		}catch(Coustomized e) {
			System.out.println("you are kid you cannot vote");
		}
}
}

class Age{
	void m1(int age) throws Coustomized {
		if(age<18)
			throw new Coustomized();
		else
			System.out.println("you can vote");
	}
}

class Coustomized extends Throwable
{
	Coustomized(){
		super();
	}
}