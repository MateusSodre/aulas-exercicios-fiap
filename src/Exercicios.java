import java.util.Scanner;
public class Exercicios {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double diasFumante;
		
		System.out.println("Digite o preço do maço: ");
		double precoMaco = entrada.nextDouble();
		System.out.println("Digite a quantidade de maços: ");
		double qtdMaco = entrada.nextDouble();
		System.out.println("Digite a quantidade de anos que você fuma:");
		double anos = entrada.nextDouble();

		diasFumante = anos * 365;
		double custo = diasFumante * precoMaco;
		
		System.out.println("Você ja gastou r$ " + custo + " Fumando");
	}

}