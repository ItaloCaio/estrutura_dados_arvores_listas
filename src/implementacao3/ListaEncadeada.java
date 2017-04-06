package implementacao3;

public class ListaEncadeada implements ListaEncadeada_IF {

	protected Integer data;
	protected ListaEncadeada next;
	
	public ListaEncadeada(){
		
		next = new ListaEncadeada();
	}

	@Override
	public boolean isEmpty() {

		if (data == null)
			return true;

		return false;
	}

	@Override
	public int size() {

		if (isEmpty())
			return 0;
		else
		{
			return 1 + next.size();
			
		}

		
	}

	@Override
	public int search(int element) throws Exception {

		if (isEmpty())
			return -1;
		else if (data == element)
			return data;
		else
			return next.search(element);

	}

	@Override
	public void insert(int element) {

		if (isEmpty()) {
			data = element;
			next = new ListaEncadeada();

		} else {
			int aux;
			if (next.isEmpty()) {

				aux = data;
				data = element;
				next = new ListaEncadeada();
				next.data = aux;

			} else {
				aux = data;
				data = element;
				element = next.data;
				next.data = aux;

				next.insert(element);
			}

		}

	}

	@Override
	public void remove(int element) {
		// TODO Auto-generated method stub

	}

	@Override
	public int[] toArray() {

		int array[] = new int[size()];

		toArray(array, this, 0);

		return array;
	}

	public void toArray(int array[], ListaEncadeada node, int cont) {

		if (!node.isEmpty()) {
			cont = cont + 1;
			array[cont] = node.data;

			toArray(array, node, cont);
		}

	}

}
