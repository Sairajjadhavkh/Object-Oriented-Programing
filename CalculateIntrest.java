package lab;

import java.util.InputMismatchException;

public class CalculateIntrest {

	public static void main(String[] args) throws Coustomize {
		// TODO Auto-generated method stub
		SBI a=new SBI();
			a.balance=MyConsole.getInteger("Enter the minimum balance amount which is 3000");
			if(a.balance<3000) {
				try {
					throw new Coustomize("you need to Deposit minimum balance to axcess your account");
				}catch(Coustomize e) {
					System.err.println(e.getMessage());
				}finally {
					System.out.println("Thank You for visiting bank !");
				}
			}
			else {
				switch(MyConsole.getInteger("press 1 if you want to credit or press 2 if you want to debit")){
			case 1:
				a.credit(MyConsole.getInteger("Enter the amount you want to credit"));
				System.out.println("After Crediting your balance your balance is "+a.balance);
				a.calculateIntrest(6.5, MyConsole.getDouble("Enter for how much year you want to calculate intrest"));
				System.out.println("After calculating the intrest you will get "+a.balance+" after "+a.period+" years");
				break;
			case 2:
			a.debit(MyConsole.getInteger("Enter the amount you want to debit"));
			if(a.balance<0) {
				try {
					throw new Coustomize("Insufficient Balance");
				}catch(Coustomize e) {
					System.err.println(e.getMessage());
				}finally {
					System.out.println("Thank You for visiting bank !");
				}
				
			}
			else {
				System.out.println("After Debiting your balance your balance is "+a.balance);
				a.calculateIntrest(6.5, MyConsole.getDouble("Enter for how much year you want to calculate intrest"));
				System.out.println("After calculating the intrest you will get "+a.balance+" after "+a.period+" years");
				}
			/*default:
				System.out.println("Wrong input sorry we cannot process");
				break;*/
		}
			}
		
	}
}

abstract class Bank{
	double balance;
	void credit(double amount) {balance+=amount;}
	void debit(double amount) {
		balance-=amount;
	}
	abstract void calculateIntrest(double rate,double period);
}

class SBI extends Bank{
	double period;
	void calculateIntrest(double rate,double period) {
		double a=this.balance;
		this.period=period;
		double intrest=(rate*this.period*a)/100;
		balance+=intrest;
	}
}

class Coustomize extends Exception{
	public Coustomize(String a) {
		super(a);
	}
}
