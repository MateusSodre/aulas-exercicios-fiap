import java.util.Scanner;
public class funcSemparam {
	
	public static double pi()
	{
		return (3.14159);
	}
	
	public static void main(String[]args)
	{
		double a;
		double r =10;
		 
		a = pi() * (r*r);
		System.out.print("A área do círculo com raio " + r + " é " + a);
	}

}
