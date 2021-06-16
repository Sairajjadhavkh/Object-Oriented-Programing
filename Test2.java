package lab;
/*Define a new exception, called ExceptionLineTooLong, that prints out the error message
"The strings is too long". Write a program that reads all lines of a file and throws an exception of type
ExceptionLineTooLong in the case where a string of the file is longer than 80 characters. Handle also all
exceptions that could be thrown by the program.*/
public class Test2 {
	public static void main(String args[]) {
		Get age=new Get();	
		try {
			age.vote(MyConsole.getInteger("enter your age"));
		}catch(ExceptionLineTooLong e) {
			System.out.println(e.getMessage());
		}
	}
}

class ExceptionLineTooLong extends Exception{
	     ExceptionLineTooLong(String msg){
		super(msg);
	}
}

class Get{
	void vote(int age) throws  ExceptionLineTooLong {
	if(age<18) {
		throw new ExceptionLineTooLong("you are below age you cannot vote");
	}
	else {
		System.out.println("you can vote");
	}
}	
}

