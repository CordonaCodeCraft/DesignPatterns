package behavioral.iterator.binary_tree;

public class Main {
	public static void main(String[] args) {
		final Node<Integer> root = new Node<>(1, new Node<>(2), new Node<>(3));
		final InOrderIterator<Integer> iterator = new InOrderIterator<>(root);

		while (iterator.hasNext()) {
			System.out.println("" + iterator.next() + ",");
		}
		System.out.println();

		final BinaryTree<Integer> tree = new BinaryTree<>(root);

		for (int n : tree) {
			System.out.println("" + n + ",");
		}
		System.out.println();
	}
}
