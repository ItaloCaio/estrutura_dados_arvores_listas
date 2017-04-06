package implementacao3;

public class ListaEncadeada implements ListaEncadeada_IF {

	protected int data =-1;
	protected ListaEncadeada next;
	


	@Override
	public boolean isEmpty() {

		if (data == -1)
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
			
			int aux = data;
			data = element;
			
			next.insert(aux);

		}

	}

	@Override
	public void remove(int element) {
		
		if(isEmpty()){
			
		}
		else
		{
			if(data == element){
				data = next.data;
				next = next.next;
			}
			else
				next.remove(element);
			
		}
		
		
		
	}

	@Override
	public int[] toArray() {
		
		int cont = 0 ;
		
		int array[] = new int[size()];

		toArray(array, this, 0);

		return array;
	}

	public void toArray(int array[], ListaEncadeada node, int cont) {

		if (!(node.isEmpty())) {
			
			array[cont++] = node.data;

			toArray(array, node.next, cont);
		}

	}

}
