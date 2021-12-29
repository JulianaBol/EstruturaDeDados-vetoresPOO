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
				System.out.println("Qual posição deseja excluir?");
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
					System.out.println("Valor não encontrado!\n ");
				}else {
					System.out.println("O valor "+num+" está na posição "+ resultado+"\n");
				}
			}
			if(op == 5) {
				if(vetor.getTot()==0) {
					System.out.println("O vetor está vazio!\n");
				}else {
					System.out.println("O vetor tem "+vetor.getTot()+" valores armazenados\n");
				}
			}			
			if(op == 6) {
				vetor.maior();
				vetor.menor();
				if( vetor.getMaior() != vetor.getMenor()) {
					System.out.println("O maior valor é "+vetor.getMaior()+" e o menor valor é "+ vetor.getMenor()+"\n");				
				}if (vetor.getTot() == 1) {
					System.out.println("O vetor tem somente 1 valor armazenado!\n");
				}if (vetor.getTot()== 0) {
					System.out.println("O vetor está vazio!\n");
				}				
			}
			if(op == 7) {
				vetor.aleatorios();
				vetor.BubbleSort();
				System.out.println("O vetor foi preenchido com valores aleatórios\n");
			}
			if(op == 9) {
				vetor.listar();
			}
			vetor.abrirMenu();
			op = input.nextInt();
		}
		System.out.println("Aplicação com vetores finalizada!");
	}

}
