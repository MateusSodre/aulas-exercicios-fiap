import java.util.Scanner;
public class lacoEnquantofacaExer {
		public static void main(String[]args ) {
			
			Scanner teclado = new Scanner(System.in);
			
			float num;
			float soma;
			
			System.out.println("Digite 0 para finalizar");
			soma = 0;
			num = 1;
			
			while(num != 0){
				System.out.println("Digite um número: ");
				num = teclado.nextFloat();
				soma += num;
			}
			System.out.println("Somatória = " + soma);
		}
}
