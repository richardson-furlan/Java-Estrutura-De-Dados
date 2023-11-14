package EstruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class PilhaDeLivros {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();
		Scanner ler = new Scanner(System.in);
		String livro;
		int op;
		
		do {
			System.out.println("\n\t\tMenu");
			System.out.println("******************************************************");
			System.out.println("\n\t1 - Adicionar Livros na Pilha");
			System.out.println("\t2 - Listar todos os Livros");
			System.out.println("\t3 - Retirar Livro da pilha ");
			System.out.println("\t0 - Sair");
			System.out.println("\n******************************************************");
			System.out.println("Entre com a opção desejada: ");
		
			op = ler.nextInt();
		
			switch (op) {
			case 1:
				ler.nextLine();
				System.out.println("Digite o nome : ");
				
				pilha.push(ler.nextLine());
				
				
				System.out.println("\nPilha: ");
				for(String in:pilha){
					System.out.println(in);
				}
				System.out.println("\nLivro Adicionado!");
				break;
				
			case 2:
				if(pilha.isEmpty()) {
					System.out.println("\nA Pilha está vazia!");
				} else {
				System.out.println("\nLista de Livros na Pilha: ");
				for(String in:pilha){
					System.out.println(in);
					}
				}
				break;
				
			case 3:
				if(pilha.isEmpty()) {
					System.out.println("\nA Pilha está vazia!");
				} else {
					pilha.pop();
					System.out.println("\nPilha: ");
					for(String in:pilha){
						System.out.println(in);
						}
					System.out.println("\n Um Livro foi retirado!");
				}
				break;
				
			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;
				
			default:
				System.out.println("\nOpção inválida!!!");
				
			}
		
		}
		while(op !=0);
		

		
	}

}
