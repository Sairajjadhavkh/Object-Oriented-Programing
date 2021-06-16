package lab;

public class ArrayIntegerRepeat {
	public static void main(String args[])
	{
		int count=0;
		int arr[]= {0,1,2,3,4,5,5,5,5};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
		}
		if(count>=1)
			System.out.println(count+" repetation");
		else
			System.out.println(count+ "repetation");
	}
}
