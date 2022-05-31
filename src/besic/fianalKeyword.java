package besic;

public class fianalKeyword {

	int a;
	
	fianalKeyword()
	{
		System.out.println(this.a);
	}
	public void setA(int a) {
		this.a = a;
	}


	public int getA() {
		return a;
	}
	
	public static void main(String[] args) {
		fianalKeyword a = new fianalKeyword();
		a.getA();
	}
}
