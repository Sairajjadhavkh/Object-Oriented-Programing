import java.util.Scanner;
class First2Element
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	for(int i=0;i<=arr.length-1;i++)
	{
	arr[i]=sc.nextInt();
	}
	System.out.print("first 2 elements are:");
	for(int i=0;i<=1;i++)
	{
		System.out.print(" "+arr[i]);
	}
	
	
}
}