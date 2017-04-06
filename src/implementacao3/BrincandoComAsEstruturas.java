package implementacao3;

import java.util.Arrays;

public class BrincandoComAsEstruturas {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Brincando com ListaEncadeada...");
		ListaEncadeada_IF lista = new ListaEncadeada();
		System.out.println(lista.isEmpty());
		System.out.println(lista.size() == 0);
		lista.insert(100);
		System.out.println(lista.size() == 1);
		System.out.println(lista.toArray()[0] == 100);
		lista.insert(200);
		System.out.println(lista.size() == 2);
		System.out.println(lista.toArray()[0] == 200);
		System.out.println(lista.toArray()[1] == 100);
		lista.insert(300);
		System.out.println(lista.size() == 3);
		System.out.println(lista.toArray()[0] == 300);
		System.out.println(lista.toArray()[1] == 200);
		System.out.println(lista.toArray()[2] == 100);
		lista.remove(100);
		System.out.println(lista.size() == 2);
		System.out.println(lista.toArray()[0] == 300);
		System.out.println(lista.toArray()[1] == 200);
		lista.remove(300);
		System.out.println(lista.size() == 1);
		System.out.println(lista.toArray()[0] == 200);
		System.out.println(lista.search(200) == 200);
		System.out.println();
		
		
		
		System.out.println("Brincando com BST...");
		ArvoreBinaria_IF arvore1 = new BST();
		arvore1.insert(8);
		System.out.println(arvore1.isComplete());
		System.out.println(Arrays.toString(arvore1.preOrder()).equals("[8]"));
		System.out.println(Arrays.toString(arvore1.order()).equals("[8]"));
		System.out.println(Arrays.toString(arvore1.postOrder()).equals("[8]"));
		arvore1.insert(12);
		System.out.println(!arvore1.isComplete());
		arvore1.insert(14);
		System.out.println(!arvore1.isComplete());
		arvore1.insert(15);
		System.out.println(!arvore1.isComplete());
		arvore1.insert(4);
		System.out.println(!arvore1.isComplete());
		arvore1.insert(2);
		System.out.println(!arvore1.isComplete());
		arvore1.insert(1);
		System.out.println(!arvore1.isComplete());
		arvore1.insert(13);
		System.out.println(!arvore1.isComplete());
		arvore1.insert(3);
		System.out.println(!arvore1.isComplete());
		arvore1.insert(6);
		System.out.println(!arvore1.isComplete());
		arvore1.insert(7);
		System.out.println(!arvore1.isComplete());
		arvore1.insert(10);
		System.out.println(!arvore1.isComplete());
		arvore1.insert(9);
		System.out.println(!arvore1.isComplete());
		arvore1.insert(5);
		System.out.println(!arvore1.isComplete());
		arvore1.insert(11);
		System.out.println(arvore1.isComplete());
		System.out.println(Arrays.toString(arvore1.preOrder()).equals(Arrays.toString(new int[]{8,4,2,1,3,6,5,7,12,10,9,11,14,13,15})));
		System.out.println(Arrays.toString(arvore1.order()).equals(Arrays.toString(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15})));
		System.out.println(Arrays.toString(arvore1.postOrder()).equals(Arrays.toString(new int[]{1,3,2,5,7,6,4,9,11,10,13,15,14,12,8})));

		
		
		System.out.println("Brincando com MaxHeap...");
		ArvoreBinaria_IF arvore2 = new MaxHeap();
		arvore2.insert(8);
		System.out.println(arvore2.isComplete());
		System.out.println(Arrays.toString(arvore2.preOrder()).equals("[8]"));
		System.out.println(Arrays.toString(arvore2.order()).equals("[8]"));
		System.out.println(Arrays.toString(arvore2.postOrder()).equals("[8]"));
		arvore2.insert(12);
		System.out.println(!arvore2.isComplete());
		arvore2.insert(14);
		System.out.println(arvore2.isComplete());
		arvore2.insert(15);
		System.out.println(!arvore2.isComplete());
		arvore2.insert(4);
		System.out.println(!arvore2.isComplete());
		arvore2.insert(2);
		System.out.println(!arvore2.isComplete());
		arvore2.insert(1);
		System.out.println(arvore2.isComplete());
		arvore2.insert(13);
		System.out.println(!arvore2.isComplete());
		arvore2.insert(3);
		System.out.println(!arvore2.isComplete());
		arvore2.insert(6);
		System.out.println(!arvore2.isComplete());
		arvore2.insert(7);
		System.out.println(!arvore2.isComplete());
		arvore2.insert(10);
		System.out.println(!arvore2.isComplete());
		arvore2.insert(9);
		System.out.println(!arvore2.isComplete());
		arvore2.insert(5);
		System.out.println(!arvore2.isComplete());
		arvore2.insert(11);
		System.out.println(arvore2.isComplete());
		System.out.println(Arrays.toString(arvore2.preOrder()).equals(Arrays.toString(new int[]{15,14,13,8,3,7,4,6,12,10,2,9,11,1,5})));
		System.out.println(Arrays.toString(arvore2.order()).equals(Arrays.toString(new int[]{8,13,3,14,4,7,6,15,2,10,9,12,1,11,5})));
		System.out.println(Arrays.toString(arvore2.postOrder()).equals(Arrays.toString(new int[]{8,3,13,4,6,7,14,2,9,10,1,5,11,12,15})));

		
		
		System.out.println("Brincando com TabelaHash...");
		TabelaHash_IF tabela = new TabelaHash(8);
		System.out.println(tabela.print().equals("0: \n1: \n2: \n3: \n4: \n5: \n6: \n7: "));
		for (int key = 1; key < 25; key++) {
			tabela.insert(key);
			System.out.println(tabela.search(key) == key);
		}
		System.out.println(tabela.print().equals("0: 24, 16, 8\n1: 17, 9, 1\n2: 18, 10, 2\n3: 19, 11, 3\n4: 20, 12, 4\n5: 21, 13, 5\n6: 22, 14, 6\n7: 23, 15, 7"));
		int[] elementosARemover = new int[]{1,2,5,7,8,9,13,17,18,20,21,23};
		for (int i = 0; i < elementosARemover.length; i++) {
			tabela.remove(elementosARemover[i]);
		}
		System.out.println(tabela.print().equals("0: 24, 16\n1: \n2: 10\n3: 19, 11, 3\n4: 12, 4\n5: \n6: 22, 14, 6\n7: 15"));
		
		
		
		//OBS.: Espera-se que nenhum print mostre 'false' na tela!
		
	}
	

}
