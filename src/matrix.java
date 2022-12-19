import java.util.Scanner;
public class matrix {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
				
		int matriz[][] = new int[3][4];

        int l, c;

       

        for(l = 0; l < 3; l++)

        {

                    for(c = 0; c < 4; c++)

                    {

                               matriz[l][c] = l + c;

                    }
        }
	}
}