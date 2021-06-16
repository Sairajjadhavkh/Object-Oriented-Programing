package lab;

import java.util.Arrays;

public class SortNumber {
	public static void main(String[] args) {
		int[] arr = new int[MyConsole.getInteger("enter the length of array")];
		int arr3[]=new int[arr.length];
		int arr2[]=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = MyConsole.getInteger("enter element");
			arr3[i]=arr[i];
		}
		int rem;
		
		for (int i = 0; i < arr.length; i++) {
			int num = 0;
			while (arr[i] != 0) {
				rem = arr[i] % 10;
				arr[i] /= 10;
				num += rem;
				
			}
			arr2[i]=num;
			
		}
		int a;
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr2[i]>arr2[j]) {
				a=arr2[i];
				arr2[i]=arr2[j];
				arr2[j]=a;
				
				temp=arr3[i];
				arr3[i]=arr3[j];
				arr3[j]=temp;
				}	
			}
		}
		//Arrays.sort(arr2);
		for(int sai:arr2) {
			System.out.println(sai);
		}
		for(int sai:arr3) {
			System.out.println(sai);
		}
	}
}
