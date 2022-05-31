package inputMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseBufferReader{
	
	public static void main(String[] args) throws IOException {
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
//		String str = s.readLine();
//		System.out.println(str);
		System.out.println("vikram");
		int n = Integer.parseInt(s.readLine());
		System.out.println(n);
		s.close();
		System.out.println("vikram");
		System.out.println("vikram");
	}
}
