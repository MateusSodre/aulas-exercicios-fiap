import java.util.Scanner;
	public class caseTest {
		
		public static void main(String[] args) {
	
			Scanner entrada = new Scanner(System.in);
	
			int n;
			
			System.out.print("Digite um numero: ");
			n = entrada.nextInt();
			if (n == 1)
				System.out.println("Domingo");
			else if (n == 2)
				System.out.println("Segunda-feira");
			else if (n == 3)
				System.out.println("Terça-feira");
			else if (n == 4)
				System.out.println("Quarta-feira");
			else if (n == 5)
				System.out.println("Quinta-feira");
			else if (n == 6)
				System.out.println("Sexta-feira");
			else if (n == 7)
				System.out.println("Sábado");
			else
				System.out.println("Dia invalido");
		}
}
