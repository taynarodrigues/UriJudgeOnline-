import java.util.Scanner;

public class SomaSimples {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero");
		int A = scan.nextInt();
		System.out.println("Entre com o segundo numero");
		int B = scan.nextInt();
		
		int SOMA = A + B;
		System.out.println("SOMA = " + SOMA);
	}
}
