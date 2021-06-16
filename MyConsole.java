package lab;

import java.util.Scanner;

public class MyConsole {
	public static Scanner sc=new Scanner(System.in);
	public static int getInteger(String question) {
		System.out.println(question);
		return sc.nextInt();
	}
	public static double getDouble(String question) {
			System.out.println(question);
			return sc.nextDouble();
	}
	public static String getString(String question) {
		System.out.println(question);
		return sc.nextLine();
	}
}
