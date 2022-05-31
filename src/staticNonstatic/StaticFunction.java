package staticNonstatic;

public class StaticFunction {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticFunction obj1 = new StaticFunction();
//		obj1.print();
//		obj1.sprint();
		StaticFunction.sprint();
		sprint();
	}
	
	public void print()
	{
		System.out.println("I'm Non - Static function! ");
	}
	
	public static void sprint()
	{
		System.out.println("I'm Static function! ");
	}

}
