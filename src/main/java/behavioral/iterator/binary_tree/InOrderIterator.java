package behavioral.iterator.binary_tree;

import java.util.Iterator;

public class InOrderIterator<T> implements Iterator<T> {
	private Node<T> current;
	private Node<T> root;
	public boolean yieldedStart;

	public InOrderIterator(final Node<T> root) {
		this.root = current = root;

		while (current.left != null) {
			current = current.left;
		}
	}

	private boolean hasRightmostParent(final Node<T> node) {
		if (node.parent == null) {
			return false;
		} else {
			return (node == node.parent.left || hasRightmostParent(node.parent));
		}
	}

	@Override
	public boolean hasNext() {
		return current.left != null || current.right != null || hasRightmostParent(current);
	}

	@Override
	public T next() {
		if (!yieldedStart) {
			yieldedStart = true;
			return current.value;
		}

		if (current.right != null) {
			current = current.right;
			while (current.left != null)
				current = current.left;
			return current.value;
		} else {
			Node<T> p = current.parent;
			while (p != null && current == p.right) {
				current = p;
				p = p.parent;
			}
			current = p;
			return current.value;
		}
	}
}
