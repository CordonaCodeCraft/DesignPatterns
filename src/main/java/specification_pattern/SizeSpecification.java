package specification_pattern;

import static specification_pattern.Product.*;

public class SizeSpecification implements Specification<Product> {
	private final Size size;

	public SizeSpecification(final Size size) {
		this.size = size;
	}

	@Override
	public boolean isSatisfied(Product product) {
		return product.getSize() == size;
	}
}
