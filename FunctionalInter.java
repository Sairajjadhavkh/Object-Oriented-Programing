package lab;

public class FunctionalInter {
	public static void main(String args[])
	{
		ITest sai=() -> System.out.println("hello world");
		sai.testFunc();
		MathInterface cal=(double v1, double v2) -> {
			System.out.println("returning");
			return v1+v2;
		};
		System.out.println(cal.mathFunc(23, 34));

	}
}


interface ITest{
	void testFunc();
}
@FunctionalInterface
interface MathInterface{
	double mathFunc(double v1, double v2);
	
}
