package implementacao3;

/*
 * Interface para implementação da classe "BST" e da classe "MaxHeap"
 */
public interface ArvoreBinaria_IF {
	public void insert(int element);
	public int[] preOrder();
	public int[] order();
	public int[] postOrder();
	public boolean isComplete();
}
