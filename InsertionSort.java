package programandoVetoresPoo;
import java.util.Random;

public class InsertionSort {
	
	public static void main(String[]args) {
		
		int vetor [] = new int [10];		
		Random num = new Random(654321);
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = num.nextInt(1 + 50);
		}
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]+" ");
		}
		System.out.println();
		insertionSort(vetor);
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]+" ");
		}
	}	
	public static void insertionSort(int v[]) {
		int aux, j;
		for(int i = 1; i < v.length; i++) {
			aux = v[i];//variavel que guarda o anterior
			j = i - 1;
			while((j >= 0) && v[j] > aux) {
				//"empurra" o maior para a direita
				v[j + 1] = v[j];
				j--;
			}
			//tras o menor para a esquerda
			v[j + 1] = aux;
		}
	}

}
