package programandoVetoresPoo;
import java.util.Scanner;

public class ExeVetor02 {

	public static int numInt(int n) {
		if(n <= 0) {
			System.out.println("Digite somente numeros inteiros positivos!");
		}		
		return n;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		
		int op, num;
		
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
				if(vetor.getTot()==0) {
					System.out.println("O vetor está vazio!");
				}else {
					System.out.println("O vetor tem "+vetor.getTot()+" valores armazenados");
				}
			}
			if(op == 5) {
				vetor.maior();
				vetor.menor();
				if( vetor.getMaior() != vetor.getMenor()) {
					System.out.println("O maior valor é "+vetor.getMaior()+" e o menor valor é "+ vetor.getMenor());				
				}if (vetor.getTot() == 1) {
					System.out.println("O vetor tem somente 1 valor armazenado!");
				}if (vetor.getTot()== 0) {
					System.out.println("O vetor está vazio!");
				}				
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
