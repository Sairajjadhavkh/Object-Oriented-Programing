package lab;

public class Constructor {
	public static void main(String args[])
	{
		sai cl = new sai();
	}
}


class Baseclass{
	//Default
	public Baseclass() {
		System.out.println("base class is created");
	}
	//Parameterized
	public Baseclass(String arg) {
		this();//One constructor calling the other....
		System.out.println("base class is created with String arg " + arg);
	}
	public Baseclass(int arg) {
		System.out.println("base class is created with int arg " + arg);
	}
}

class Derivedclass extends Baseclass{
	//Will call the default constructor implicitly. If there is no default constructor, then it is the responsibility of the derived class to call the specific base class constructor... 
	  Derivedclass() {
		  super("sairaj jadhav");
		System.out.println("calling derived class constructer");
	}
}
class sai extends Derivedclass{
	sai(){
		System.out.println("my name is sai");}
}



