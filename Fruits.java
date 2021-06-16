package lab;

public class Fruits {

	public static void main(String[] args) {
		
		Basket cal=new Basket();
		cal.noOfApples(10);
		cal.noOfMangos(20);
		cal.calculate();
	}

}

class Apples {
	int apple;
	void noOfApples(int a) {
		apple=a;
		System.out.println("no of apples :"+apple);
	}
	
}

class Mangos extends Apples{
	int mango;
	void noOfMangos(int a) {
		mango=a;
		System.out.println("no of apples :"+mango);
		
	}
}
class Basket extends Mangos{
	void calculate() {
		System.out.println("Fruits in basket :"+(mango+apple));
	}
}