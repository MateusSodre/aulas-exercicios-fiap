import java.util.Scanner;
public class subAlgo {
	// criacao do procedimento principal
	public static void saudacao(String usuario, int hora)
	{
		String msg;
			
		if(hora < 12) {
			msg = "Bom dia";
		}else if (hora < 18) {
			msg = "Boa tarde";
		}else {
			msg = "Boa noite";
		}	
			System.out.print("Olá " + usuario + "," + msg + ", seja bem vindo a FIAP");
	}
	
	public static void main(String[]args ) {
		
	saudacao("Mateus", 13);	
	}
}
