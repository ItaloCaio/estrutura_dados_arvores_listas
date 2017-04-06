package implementacao3;

public class Main {

	public static void main(String[] args) throws Exception {

		
		
		
		System.out.println("Brincando com ListaEncadeada...");
		ListaEncadeada_IF lista = new ListaEncadeada();
//		System.out.println("Esta vazia? " +lista.isEmpty());
//		System.out.println("Tamanho = 0? "+( lista.size() == 0));
//		lista.insert(100);
//		System.out.println("Tamanho = 1? " + (lista.size() == 1));
//		System.out.println("To array[0]  = 100? "+ (lista.toArray()[0] == 100));
//		lista.insert(200);
//		System.out.println(lista.size() == 2);
//		System.out.println("To array[0]  = 200? "+ (lista.toArray()[0] == 200));
//		System.out.println(lista.toArray()[1] == 100);
//		lista.insert(300);
//		System.out.println(lista.size() == 3);
//		System.out.println(lista.toArray()[0] == 300);
//		System.out.println(lista.toArray()[1] == 200);
//		System.out.println(lista.toArray()[2] == 100);
//		lista.remove(100);
//		System.out.println(lista.size() == 2);
//		System.out.println(lista.toArray()[0] == 300);
//		System.out.println(lista.toArray()[1] == 200);
//		lista.remove(300);
//		System.out.println(lista.size() == 1);
//		System.out.println(lista.toArray()[0] == 200);
//		System.out.println(lista.search(200) == 200);
//		System.out.println();
		
		lista.insert(5);
		lista.insert(4);
		lista.insert(3);
		
		for(int i =0; i < lista.toArray().length; i++){
			
			System.out.println(lista.toArray()[i]);
		}
		

	}

}
