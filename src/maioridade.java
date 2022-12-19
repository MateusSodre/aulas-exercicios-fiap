import java.util.Scanner;

public class maioridade {
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade");
		idade = entrada.nextInt();
		if (idade <18)
		{
		System.out.println("Você é menor idade");
		}
		else
		{
			System.out.println("Você é maior de idade");
		}
	}
}
