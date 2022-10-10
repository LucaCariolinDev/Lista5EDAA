import java.util.Scanner;

public class Questao2Recursividade {
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int numero = in.nextInt();
		Questao2Recursividade.retornaNumerosNaturais(numero, numero);
    }
	
	public static int retornaNumerosNaturais(int n, int init) {
		if(n == -1) {
			return 0;
		}
		int r = 1 + retornaNumerosNaturais(n - 1, init);
		if(r <= init)
			System.out.println(r);
		return r;
	}

}
