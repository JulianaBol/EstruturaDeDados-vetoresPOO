package programandoVetoresPoo;
import java.util.Random;

public class CVetor {

	int v[] = new int [10000];
	int op, num, maior, menor,tot = 0; 
	boolean vazio = true;
	
	//metodo construtor	
	public CVetor() {
		for(int i = 0; i < v.length; i++) {
			v[i] = 0;				
		}
	}
	// getters e setters	
	public int getMaior() {
		return maior;
	}
	public void setMaior(int maior) {
		this.maior = maior;
	}
	public int getMenor() {
		return menor;
	}
	public void setMenor(int menor) {
		this.menor = menor;
	}
	public int[] getV() {
		return v;
	}
	public void setV(int[] v) {
		this.v = v;
	}
	public int getOp() {
		return op;
	}
	public void setOp(int op) {
		this.op = op;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public boolean getVazio() {
		if (getV()[getNum()] == 0) {
			setVazio(true);
		}
		return vazio;
	}
	public void setVazio(boolean vazio) {
		this.vazio = vazio;
	}

	// metodos abstratos	
	public void abrirMenu() {
		System.out.println("    Aplicação com vetores ");
		System.out.println("\n   --------------------------");
		System.out.println("       MENU DE OPÇÕES:");
		System.out.println("   --------------------------");
		System.out.println("   [1] - Inserir valores no vetor");
		System.out.println("   [2] - Apagar valores no vetor");
		System.out.println("   [3] - Busca sequencial de um valor");
		System.out.println("   [4] - Busca binária de um valor");
		System.out.println("   [5] - Informar quantos valores estão no vetor");	
		System.out.println("   [6] - Informar maior e menor valores no vetor");
		System.out.println("   [7] - Gerar valores aleatórios para o vetor");
		System.out.println("   [9] - Listar vetor");
		System.out.println("   [0] - Sair");		
		System.out.println("  \n   Digite a sua opção: ");		
	}		
	
	public void inserir(int n) {
		for (int i = 0; i < v.length; i++) {
			if (this.getV()[i] == 0) {						
				v[i]=n;
				System.out.println("O valor "+ n + " foi inserido na posição "+i+"\n");
				this.setTot(this.getTot()+1);	
				break;
			}				
		}		
	}
	
	public void apagar(int num) {
		for (int i = 0; i < v.length; i++) {			
			if(i == num && v[i]==0) {
				System.out.println("Posição vazia! ");
			}else if(i == num && v[i]!=0) {
				System.out.println("O valor "+ v[i]+ " foi excluído da posição "+ i+"\n");	
				v[i]=0;
			}
		}
		setTot(this.getTot()-1);						
	}
	
	public void consultar(int n) {
		boolean contem = false;
		for(int i = 0; i < v.length; i++) {
			if(v[i] == n) {
				System.out.println("O valor "+n+" está na posição "+ i+"\n");
				contem = true;
				break;
			}
		}
		if (contem == false) {
			System.out.println("Valor não encontrado! \n");
		}		
	}
	public static int buscaBinariaRecursiva(int v[], int num) {
		return buscaRecursiva(v, num, 0, v.length - 1);		
	}
	public static int buscaRecursiva(int v[], int num, int menor, int maior) {
		int meio = (menor + maior) / 2;
		if (menor > maior) {
			return -1;
		}
		if(v[meio] == num) {
			return meio;
		}
		if(v[meio] < num) {
			return buscaRecursiva(v, num, meio + 1, maior);
		}
		else {
			return buscaRecursiva( v, num, menor, meio - 1);
		}		
	}
	public void maior () {
	
		for(int i=0; i < v.length; i++) {
			for(int j= i+1; j < v.length; j++) {
				if (v[i]==0 || v[j]==0) {
					continue;
				}
				if (v[j]>=v[i]) {
					this.setMaior(v[j]);
				}else {
					this.setMaior(v[i]);
				}
			}			
		}				
	}			
	public void menor () {
		
		for (int vet:v) {
			if(vet == 0) {
			continue;				
			}else {
				this.setMenor(vet);
				break;
			}
		}			
		for (int i = 0; i < v.length ; i++) {
			for(int j = i+1; j < v.length; j++) {
				if(v[j] < v[i] && v[j]!=0) {
					this.setMaior(v[j]);
				}			
			}
		}
	}
	public void aleatorios() {
		Random num = new Random(654321);
		for(int i = 0; i < v.length; i++) {
			if(v[i] == 0) {
				v[i] = num.nextInt(1 + 10000);
				this.setTot(this.getTot()+1);
			}else {
				continue;
			}
		}
	}
	public void BubbleSort() {
		for(int ultimo = v.length -1; ultimo > 0; ultimo--) {
			for(int i = 0; i < ultimo; i++) {
				if(v[i] > v[i+1]) {
					troca(v, i, i+1);
				}
			}
		}
	}			
	public static void troca(int v[], int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}
	public void listar() {
		for (int i = 0; i < 10; i++) {
			System.out.println(" vetor "+"["+ i +"]"+ " => "+ v[i]);			
		}
		for (int i = v.length - 11; i < v.length; i++) {
			System.out.println(" vetor "+"["+ i +"]"+ " => "+ v[i]);			
		}
	}		
}
