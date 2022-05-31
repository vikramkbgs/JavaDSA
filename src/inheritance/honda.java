package inheritance;

public class honda extends car
{
	
	honda(int a , int b)
	{
		super(a, b);
		System.out.println("constructor of honda");
	}
	honda()
	{
		System.out.println("without parameter");
	}
    int c = 10;
    public  int getC()
    {
    return c;
    }
}