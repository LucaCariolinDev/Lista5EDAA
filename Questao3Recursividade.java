import java.util.Scanner;

public class Questao3Recursividade {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número k: ");
		int k = in.nextInt();
		System.out.println("Digite um número n: ");
		int n = in.nextInt();
		int result = Questao3Recursividade.calculaPotencia(k, n);
		System.out.println(result);
    }
	
	public static int calculaPotencia(int k, int n) {
		if(n == 1) {
			return k;
		}
		return k * calculaPotencia(k, n - 1);
	}
}
