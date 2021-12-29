package programandoVetoresPoo;
import java.util.Scanner;


public class ProgramaComVetor {
	public static int numInt(int n) {
		if(n <= 0) {
			System.out.println("Digite somente numeros inteiros positivos!\n");
		}		
		return n;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		
		int op, num, resultado;
		
		CVetor vetor = new CVetor();
		
		vetor.abrirMenu();
		op = input.nextInt();
		
		while(op != 0) {
			
			if(op ==1) {
				System.out.println("Qual valor deseja inserir?");
				num = numInt(input.nextInt());
				if(num > 0) {
					vetor.inserir(num);
				}
			}
			if(op ==2) {
				System.out.println("Qual posi��o deseja excluir?");
				vetor.apagar(num=input.nextInt());							
			}
			if(op == 3) {
				System.out.println("Qual valor deseja consultar?");
				vetor.consultar(num=input.nextInt());			
			}
			if(op == 4) {
				vetor.BubbleSort();
				System.out.println("Qual valor deseja consultar?");
				resultado = vetor.buscaBinariaRecursiva(vetor.getV(),num = input.nextInt());				
				if(resultado == -1) {
					System.out.println("Valor n�o encontrado!\n ");
				}else {
					System.out.println("O valor "+num+" est� na posi��o "+ resultado+"\n");
				}
			}
			if(op == 5) {
				if(vetor.getTot()==0) {
					System.out.println("O vetor est� vazio!\n");
				}else {
					System.out.println("O vetor tem "+vetor.getTot()+" valores armazenados\n");
				}
			}			
			if(op == 6) {
				vetor.maior();
				vetor.menor();
				if( vetor.getMaior() != vetor.getMenor()) {
					System.out.println("O maior valor � "+vetor.getMaior()+" e o menor valor � "+ vetor.getMenor()+"\n");				
				}if (vetor.getTot() == 1) {
					System.out.println("O vetor tem somente 1 valor armazenado!\n");
				}if (vetor.getTot()== 0) {
					System.out.println("O vetor est� vazio!\n");
				}				
			}
			if(op == 7) {
				vetor.aleatorios();
				vetor.BubbleSort();
				System.out.println("O vetor foi preenchido com valores aleat�rios\n");
			}
			if(op == 9) {
				vetor.listar();
			}
			vetor.abrirMenu();
			op = input.nextInt();
		}
		System.out.println("Aplica��o com vetores finalizada!");
	}

}
