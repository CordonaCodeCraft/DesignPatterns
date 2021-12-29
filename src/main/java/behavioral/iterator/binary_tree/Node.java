package behavioral.iterator.binary_tree;

public class Node<T> {
	public T value;
	public Node<T> parent;
	public Node<T> left;
	public Node<T> right;

	public Node(final T value) {
		this.value = value;
	}

	public Node(final T value, final Node<T> left, final Node<T> right) {
		this.value = value;
		this.left = left;
		this.right = right;

		left.parent = right.parent = this;
	}


}
