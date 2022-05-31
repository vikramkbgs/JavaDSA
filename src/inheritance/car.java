package inheritance;

 public class car{
    
    private int a;
    int b;
    public car(int a , int b)
    {
    	this.a = a;
    	this.b = b;
    	System.out.println("constructor of car"+this.a+" "+this.a);
    }
    public car(){
    	System.out.println("base without parameter");
    }
    
    public void setA(int x)
    {
        a = x;
    }
     
    public int getA()
    {
        return a;
    }
}
