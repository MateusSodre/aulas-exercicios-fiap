import java.util.Scanner;
public class exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double valor;
		double porc;
		double acres;
		double desc;
		double perc;
		
		System.out.print("Digite um valor R$ ");
		valor = entrada.nextDouble();
		System.out.print("Digite a porcentagem");
		porc = entrada.nextDouble();
		perc = valor * porc / 100;
		acres = valor + perc;
		desc = valor - perc;
		System.out.println("Percentual: " + perc);
		System.out.println("Acrescimo: " + acres);
		System.out.println("Desconto: " + desc);	
			
}
}