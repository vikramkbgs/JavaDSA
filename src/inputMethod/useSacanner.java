package inputMethod;

import java.util.Scanner;

public class useSacanner {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		s.nextLine();
		int n = s.nextInt();
		String str = s.next();
		String str2 = s.next();
		System.out.println("n: "+n);
		System.out.println("s1: "+str);
		System.out.println("s2: "+str2);
		s.close();
	}
}
