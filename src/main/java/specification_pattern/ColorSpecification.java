package specification_pattern;

import static specification_pattern.Product.Color;

public class ColorSpecification implements Specification<Product> {
	private final Color color;

	public ColorSpecification(final Color color) {
		this.color = color;
	}

	@Override
	public boolean isSatisfied(Product product) {
		return product.getColor() == color;
	}
}
