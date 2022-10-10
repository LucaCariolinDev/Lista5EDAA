import java.util.Scanner;
public class Questao1Fila {
	public static void main(String args[]){		
		Scanner in = new Scanner(System.in);
		
        Fila fila1 = new Fila(10);
        Fila fila2 = new Fila(10);
        
        boolean continueRecevingInput = true;
        
        while(continueRecevingInput) {
        	System.out.println("Digite uma letra maiúscula ou minúscula");
        	String retorno = in.nextLine();
        	if(retorno.isEmpty()) {
        		continueRecevingInput = false;	
        	}
        	else {
        		char caractere = retorno.charAt(0);
        		if(Character.isLetter(caractere))
        		{
        			if(Character.isUpperCase(caractere)) {
        				fila1.push(caractere);
        			}
        			else {
        				fila2.push(caractere);
        			}
        		}
        	}
        }
        
    	System.out.println("RETIRANDO DA FILA...");
    	
    	System.out.println("Maiúscula");
    	
    	int tamanhoFila1 = fila1.size();
    	int tamanhoFila2 = fila2.size();
    	
    	for(int i=0; i < tamanhoFila1; i++) {
    		System.out.println("Removendo valor: " + fila1.front());
    		fila1.pop();
    	}
    	
    	System.out.println("");
    	
    	System.out.println("Minúscula");
    	
    	for(int i=0; i < tamanhoFila2; i++) {
    		System.out.println("Removendo valor: " + fila2.front());
    		fila2.pop();
    	}
    }
}
