import java.util.Scanner;
public class funComparam {
	public static boolean notaValida(double nota)
	{
		if (nota >= 0 && nota <= 10)
			return (true);
		else
			return (false);
	}


	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double nota1;
		double nota2;
		double media;
		
		System.out.print("Digite a nota 1: ");
		nota1 = entrada.nextDouble();
		
		if (notaValida(nota1))
		{
			System.out.print("Digite a nota 2: ");
			nota2 = entrada.nextDouble();
			if (notaValida(nota2))
			{
				media = (nota1 + nota2) / 2;
				System.out.print("A media das notas " + nota1 + " e " + nota2 + " é " + media);
			}
			else
			{
				System.out.print("A nota 2 => " + nota2 + " É inválida");
			}
		} 
		else
		{
			System.out.print("A nota 1 => " + nota1 + " É inválida");
		}
	}
}
