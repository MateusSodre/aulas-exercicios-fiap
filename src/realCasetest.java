import java.util.Scanner;
	public class realCasetest {
		public static void main(String[] args) {
				
				Scanner entrada = new Scanner(System.in);
		
				int n;
				
				System.out.print("Digite um numero: ");
				n = entrada.nextInt();
				
				switch (n) {
				
					case 1:
						System.out.println("Domingo");
					case 2:
						System.out.println("Segunda-feira");
					case 3:
						System.out.println("Terça-feira");
					case 4:
						System.out.println("Quarta-feira");
					case 5:
						System.out.println("Quinta-feira");
					case 6:
						System.out.println("Sexta-feira");
					case 7:
						System.out.println("Sábado");
					default:
						System.out.println("Dia invalido");
				}
		}
}
