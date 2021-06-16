package lab;

import java.io.*;
/*Create an App that takes inputs from the User that generates Username and Password
* It should have Functions: SignIn(Login) and SignUp(Register).
* It should also allow user to signoff(remove) at any point of time.*/
import java.util.*;

public class UserNamePassword {
	static Map<String, String> use = new HashMap<String, String>();
	public static void main(String[] args) {
		int count=0;
		do {
			switch(MyConsole.getString("Press 1 for signup or press 2 for login")){
		case "1":
			String a=MyConsole.getString("enter username");
			String b=MyConsole.getString("enter password");
			use.put(a,b);
			break;
		case "2":
			String c=MyConsole.getString("enter username");
			String d=MyConsole.getString("enter password");
			//use.put(c, d);
			for(Map.Entry m : use.entrySet()){    
			    if(m.getKey()==c && m.getValue()==d) {
			    	System.out.println("you loged in");
			    } 
			    else {
			    	System.out.println("retry again");
			    }
			  }
			count=1;
					break;
		default:
				break;
	}
			}while(count==0);
}
}
