import java.util.Scanner;
class ArrayAvg
{
public static void main(String args[])
{
	int float=0;
	Scanner sc=new Scanner(System.in);
	float arr[];
	arr=new float[5];
	for(int i=0;i<=4;i++)
	{
	arr[i]=sc.nextFloat();
	add=add+arr[i];
	}
	float avg=(float)(add/5);
	System.out.println("average="+avg);
}
}