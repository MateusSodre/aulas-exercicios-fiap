import java.util.Scanner;
	public class calculadora {
		public static void main(String[] args) {
				
			Scanner entrada = new Scanner(System.in);
				
			double n1;
			double n2;
			double r;
				
			String operador;
				
			System.out.println("Digite o 1° número: ");
			n1 = entrada.nextDouble();
			System.out.println("Digite o 2° número: ");
			n2 = entrada.nextDouble();
			System.out.println("Digite o operador desejado: +,-,* ou /: ");
			operador = entrada.next();
				
			switch (operador){
				case "+":
					r = n1 + n2;
					System.out.println("Soma = " + r); 
					break;
				case "-":
					r = n1 - n2;
					System.out.println(" Subtração = " + r);
					break;
				case "*":
					r = n1 * n2;
					System.out.println("Multiplicação = " + r); 
					break;
				case "/":
					
					if(n2 == 0)
					System.out.println("Não há divisão por zero.");
					
				else{
						r = n1 / n2;
						System.out.println("Divisão = " + r); 
					}
					break;
				default:
					System.out.println("Operador inválido.");
		}
	}
}
