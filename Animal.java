package lab;

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mammals obj1=new Mammals();
		obj1.mammals();
		
		MarineAnimals obj2=new MarineAnimals();
		obj2.marineAnimals();

		BlueWhale obj3=new BlueWhale();
		obj3.BlueWhale();

		obj3.mammals();
		obj3.marineAnimals();
	}

}

class Mammals
{	
	void mammals(){
	System.out.println("I am mammal");
	}	
}
class MarineAnimals extends Mammals
{
	void marineAnimals(){
	System.out.println("I am a marine animal");	
	}
}

class BlueWhale extends MarineAnimals
{
	void BlueWhale(){
	System.out.println("Ibelong to both the categories: Mammals as well as Marine Animals");	
	}
}