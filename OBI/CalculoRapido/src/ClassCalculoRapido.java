import java.util.Scanner;

/*
* @author Flávio Ribeiro Lima Filho 
*/

public class ClassCalculoRapido {
	
	public static int calculoRapido(int v1, int v2, int v3) {
		
		/* Metodo calcula determina quantos numeros no intervalo
		 * [v2, v3] tem a soma de seus digitos igual a v1.
		 */
		
		int sum, qtd = 0; // Variáveis de soma e quantidade
		
		if((v1>=1)&&(v1<=36)&&(v2<=v3)&&(1<=v2)&&(v2<=10000)&&(1<=v3)&&(v3<=10000)) {
			
			/* "if" determina as seguintes condicoes:
			 * Restrições
			 * 1 ≤ S ≤ 36
			 * 1 ≤ A ≤ 10 000
			 * 1 ≤ B ≤ 10 000
			 * A ≤ B
			 */
			
			for( int i = v2; i<=v3; i++) { // Percorre todos os valores entre [v2,v3]
				sum = 0;
				int val = i;
				while(val>0) {	// Percorre todos os digitos de "val"
					sum += val%10;	// "sum" recebe o resto de "val/10"
					val /= 10;	// val = val/10 -> "val" recebe o quociente da divisao inteira de "val/10"
				}
				if(sum == v1) { // A soma dos digitos de "val" sao iguais ao "v1" Se "sum" for igual "v1"  
					qtd++; // "qtd = qtd + 1"
				}
				
			}
			
			System.out.println(qtd);	// Imprime no Console a variavel "qtd"
			return qtd;	
			
		}
		
		else {
			System.out.println("Os valores inseridos nao correspondem com as restricoes.");
			return -1;	// "return -1" indica que algum dos requisitos nao foram cumpridos
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // define a variavel "scanner" para receber valores do usuario 
		System.out.println("Digite um numero, que represente a soma de outros dois digitos: ");
		int S = scanner.nextInt();
		
		System.out.println("Digite o primeiro valor: ");
		int A = scanner.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int B = scanner.nextInt();
		
		calculoRapido(S,A,B);
		
		/* Exemplos:
		 * calculoRapido(3,10,30);
		 * calculoRapido(15,1,20);
		 * calculoRapido(1,1,10000);
		 */
		
		scanner.close();

	}

}
