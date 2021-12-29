package programandoVetoresPoo;
import java.util.Random;

public class SelectionSort {
	
	public static void main(String[]args) {
		
		int vetor [] = new int [20];		
		Random num = new Random(654321);
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = num.nextInt(1 + 50);
		}
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]+" ");
		}
		System.out.println();
		selectionSort(vetor);
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]+" ");
		}
	}		
		
	public static void selectionSort(int v[]) {
		//busca o menor elemento do vetor apartir da posicao i + 1
		for(int i = 0; i < v.length; i++) {
			int menor = i;
			//para cada posicao i acha o menor elemento e se for o caso troca
			for(int j = i+1; j < v.length; j++) {
				if(v[j] < v[menor]) {
					menor = j;
				}
			}
			troca(v, i, menor);			
		}		
	}
	public static void troca(int v[], int i, int menor) {
		int aux = v[i];
		v[i] = v[menor];
		v[menor] = aux;
	}

}
