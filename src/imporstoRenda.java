import java.util.Scanner;
	public class imporstoRenda {
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			double ir;
			double sal;
			double salLiq;
			
			System.out.print("Digite o salário");
			sal = entrada.nextDouble();
			if (sal <= 1903.98) {
				ir = 0;
			}else if (sal <= 2826.65) {
				ir = sal *0.75;
			}else if (sal <=3751.05) {
				ir = sal * 0.15;
			}else if (sal <= 4664.68) {
				ir = sal * 0.225;
			}else {
				ir = sal * 0.275;
			}
			salLiq = sal - ir;
			System.out.println("IR: " + ir);
			System.out.println("Salário liquido: " + salLiq);
		}
}
