package lab;

import java.util.Scanner;

public class Students {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate cal=new Calculate();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of students");
		int students=sc.nextInt();
		for(int i=1;i<=students;i++)
		{
			cal.calculate(sc.nextInt(), sc.nextInt(), sc.nextInt(),i);
		}
		System.out.println("Average marks of class="+(cal.total/students));		
	}
}

class Marks{
	int rollNo;
	int marks;
	String name;
}


class Calculate extends Marks{
	int total=0;
	int sum=0;
	void calculate(int physic ,int mathematics, int chemistry,int i)
	{
		int sum=physic+mathematics+chemistry;
		total+=physic+mathematics+chemistry;
		System.out.println("total marks of student"+i+"="+sum);
	}
}