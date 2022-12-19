import java.util.Scanner;

public class aumentoSalarialcondicionais {
	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);

	int tc;
	double sal;
	double aumento;
	double novo_sal;
	
	System.out.println("Digite o seu tempo de casa: ");
	tc = entrada.nextInt();
	System.out.println("Digite o seu salário: ");
	sal = entrada.nextDouble();
	if (tc < 3)
	{
		aumento = sal * 0.05;
	}
	else
	{
		aumento = sal * 0.1;
	}
	novo_sal = sal + aumento;
	System.out.println("Seu salário foi de " + sal + " para " + novo_sal);
	}
}
