import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
	
		int quantia;
		int ced50;
		int ced20;
		int ced10;
	
		 System.out.println("_________ATM__________ ");
		 System.out.println(" Digite uma quantia: "); 
		 quantia = entrada.nextInt();
		 ced50 = quantia / 50;
		 quantia = quantia % 50;
		 ced20 = quantia / 20;
		 quantia = quantia % 20;
		 ced10 = quantia % 10;
		 quantia = quantia % 10;
		 System.out.println("Quantidades de Cédulas: ");
		 System.out.println("Cédulas de 50: " + ced50);
		 System.out.println("Cédulas de 20: " + ced20);
		 System.out.println("Cédulas de 10: " + ced10);
		 System.out.println("Obrigado volte Sempre! ");
		}
}
