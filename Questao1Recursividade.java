import java.util.Scanner;

public class Questao1Recursividade {
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int numero = in.nextInt();
		int result = Questao1Recursividade.soma_recursiva(numero);
		System.out.println(result);
    }
	
	public static int soma_recursiva(int n)
	{
		if (n == 0) 
			return 0;
		
		return n + soma_recursiva(n-1);
	}
}
