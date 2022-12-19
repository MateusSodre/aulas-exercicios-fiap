import java.util.Scanner;
public class urna {
	public static void main(String[]args ) {
		
		Scanner teclado = new Scanner (System.in);
		
		int lul;
		int bolso;
		int nulo;
		int voto;
		
		System.out.println("Digite o voto ou 0 para Terminar");
		lul = 0;
		bolso = 0;
		nulo = 0;
		
		System.out.println("Digite 13 - Lula");
		System.out.println("Digite 22 - Maçonaro");
		System.out.println("Digite 1 Anular seu voto");
		System.out.println("Digite 0 para Terminar a votação");
		
		do{
			System.out.println("Digite seu voto: ");
			voto = teclado.nextInt();
			switch(voto) {
				case 13 : lul  = lul+1; break;				
				case 22 : bolso = bolso+1; break;				
				case 01 : nulo = nulo+1; break;
				default : System.out.println("Voto invalido, digite: 13, 22 ou 1");					
			}
		}
		while(voto != 0);
			System.out.println("13 - Lula: " + lul + "votos");
			System.out.println("22 - Biruliro: " + bolso + "votos");
			System.out.println("1 - Nulo: " + nulo + "votos");
	}
}
