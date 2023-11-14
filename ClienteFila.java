package EstruturaDeDados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ClienteFila {

	public static void main(String[] args) {
		int op;
		
		Queue<String> fila = new LinkedList<String>();
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("\n\t\tMenu");
			System.out.println("******************************************************");
			System.out.println("\n\t1 - Adicionar Cliente na Fila");
			System.out.println("\t2 - Listar todos os Clientes");
			System.out.println("\t3 - Retirar Cliente da Fila");
			System.out.println("\t0 - Sair");
			System.out.println("\n******************************************************");
			System.out.println("Entre com a opção desejada: ");
		
			op = ler.nextInt();
		
			switch (op) {
			case 1:
				ler.nextLine();
				System.out.println("Digite o nome: ");
				String nome = ler.nextLine();
				
				if(nome.isEmpty()) {
					System.out.println("o nome está vazio");
				}else {
					fila.add(nome);
					System.out.println("\nFila: ");
					for(Iterator<String> it = fila.iterator();it.hasNext();) {
						System.out.println(it.next());
					}
					System.out.println("\nCliente Adicionado!");
				}
				break;
				
			case 2:
				if(fila.isEmpty()) {
					System.out.println("\nA Fila está vazia!");
				} else {
				System.out.println("\nLista de Clientes na Fila: ");
				for(Iterator<String> it = fila.iterator();it.hasNext();) {
					System.out.println(it.next());
					}
				}
				break;
				
			case 3:
				if(fila.isEmpty()) {
					System.out.println("\nA Fila está vazia!");
				} else {
					fila.remove();
					System.out.println("\nFila: ");
					for(Iterator<String> it = fila.iterator();it.hasNext();) {
						System.out.println(it.next());
					}
					System.out.println("\nO Cliente foi Chamado!");
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

