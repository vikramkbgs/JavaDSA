package Class;

public class ComplexNumbers {
	
	private int R;
    private int I;
    ComplexNumbers(int R, int I)
    {
        this.R = R;
        this.I = I;
    }
    void plus(ComplexNumbers C1, ComplexNumbers C2)
    {
        C1.R = C1.R + C2.R;
        C1.I = C1.I + C2.I; 
    }
    
    void multiply(ComplexNumbers C1, ComplexNumbers C2)
    {
    	int cr1 = C1.R, ci1 = C1.I;
        C1.R = C1.R*C2.R - C1.I*C2.I;
        C1.I = cr1*C2.I + ci1*C2.R;
    }
    
    void print()
    {
        System.out.println(R+" + "+"i"+I);
    }

	public static void main(String[] args) {
		ComplexNumbers c1 = new ComplexNumbers(4, 5);
		ComplexNumbers c2 = new ComplexNumbers(6, 7);
//		c1.plus(c1, c2);
		c1.multiply(c1, c2);
		c1.print();

	}

}
