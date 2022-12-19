import java.util.Scanner;

public class moduloExerc {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int n;
		
		System.out.println("Digite um número: " );
		n = entrada.nextInt();
		if (n < 0)
		{
			n = n *-1;
		}
		System.out.println("Módulo: " + n);
	}
}
